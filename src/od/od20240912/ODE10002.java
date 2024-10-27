package od.od20240912;

import java.util.ArrayList;

public class ODE10002 {

    public static void main(String[] args) {
        //两两全排列
        //找到两两能组成的正方形 把坐标放入 result
        //去重
        int[] nums = new int[]{1,2,3,4,5};
        int[] flags = new int[nums.length];
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backtracking(0, new ArrayList<>(), result, nums, flags);
        System.out.println(result);
    }

    public static void backtracking(int start, ArrayList<Integer> list,ArrayList<ArrayList<Integer>> result, int[] nums, int[] flags) {
        if(list.size() == 2) {
            result.add(new ArrayList<>(list));
            return ;
        }

        for(int i = start ; i < nums.length ; i++) {
            if(flags[i] == 0) {
                flags[i] = 1;
                list.add(nums[i]);
            } else {
                continue;
            }

            backtracking(i +1, list, result, nums, flags);
            list.removeLast();
            flags[i] = 0;
        }
    }
}
