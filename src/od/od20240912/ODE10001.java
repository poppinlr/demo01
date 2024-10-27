package od.od20240912;

import java.util.*;

/**
 * https://fcqian.blog.csdn.net/article/details/127914382?ydreferer=aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FmY18xMjgyMjAvY2F0ZWdvcnlfMTIwNzUzMjQuaHRtbA%3D%3D
 */
public class ODE10001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String[] arr = str1.split(" ");


        int length = Integer.parseInt(arr[0]);
        int inputNum = Integer.parseInt(arr[1]);
        int[] nums = new int[length];
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 1; i <= inputNum; i++) {
            String tmpStr = sc.nextLine();
            String[] tmpArr = tmpStr.split(" ");
            int step = Integer.parseInt(tmpArr[0]);
            int index = Integer.parseInt(tmpArr[1]);
            if(map.containsKey(step)) {
                map.get(step).add(index);
            } else {
                Set<Integer> list = new HashSet<>();
                list.add(index);
                map.put(step, list);
            }
        }

        Set<Integer> last = bfs(0, 0, map, length, nums);
        System.out.println(Arrays.toString(nums));
    }

    public static Set<Integer> bfs(int step, int count, Map<Integer, Set<Integer>> map, int length, int[] nums){
        //遍历list 把list set1 如果满了就返回list
        Set<Integer> list = map.get(step);
        for (int i: list){
            nums[i] = 1;
            count++;
        }

        if(count == length){
            System.out.println(step);
            System.out.println(String.join(" ", list.stream().map(String::valueOf).toList()));
            return list;
        }

        //如果没有满， 就把list 的左右放到新的list里去， 不等于1，处理边界问题
        step++;
        Set<Integer> newList = new HashSet<>();
        for (int i: list){
            if(i-1==-1 && nums[nums.length-1]==0){
                newList.add(nums.length-1);
            }
            if(i+1 == nums.length && nums[0] == 0){
                newList.add(0);
            }

            if(i-1 >= 0 &&nums[i-1] == 0){
                newList.add(i-1);
            }
            if(i+1<nums.length && nums[i+1] == 0){
                newList.add(i+1);
            }
        }

        if(map.containsKey(step)){
            Set<Integer> mapList = map.get(step);
            mapList.addAll(newList);
            map.put(step, mapList);
        } else {
            map.put(step, newList);
        }

        return bfs(step, count, map, length, nums);
    }
}
