package od.huisu;

import java.util.ArrayList;
import java.util.List;

/**
 * 回溯就记住两个模版
 * 1. 全排列
 * 2. 子集
 */
public class 回溯 {
    //最最原始的全遍历

    /**
     * 全序遍历
     * [1, 2, 3] ->
     * [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
     * @param args
     */
//    public static void main(String[] args) {
//        int[] nums = new int[]{1,2,3};
//
//        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        int[] flags = new int[3];
//        backtrack(result, new ArrayList<>(), nums, flags);
//        System.out.println(result);
//    }
//
//    public static void backtrack(List<List<Integer>> result, ArrayList<Integer> list, int[] nums,int[] flags) {
//        if(list.size() == nums.length) {
//            result.add(new ArrayList<>(list));
//        }
//
//        for(int i = 0; i < nums.length; i++) {
//            if(flags[i] == 0) {
//                list.add(nums[i]);
//                flags[i] = 1;
//                backtrack(result, list, nums,flags);
//                list.removeLast();
//                flags[i] = 0;
//            } else {
//                continue;
//            }
//
//        }
//    }


    /**
     * 子集, 无重复, 不可复选
     * [1, 2, 3] ->
     * [[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]
     * [[], [1], [2, 1], [3, 2, 1], [3, 1], [2], [3, 2], [3]]
     * @param args
     */
    /**
     * 写法1 理解不了啊
     * @param args
     */
//    public static void main(String[] args) {
//        int[] nums = new int[]{1,2,3};
//        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        backtrack(result, new ArrayList<>(), nums,0);
//        System.out.println(result);
//    }
//
//    public static void backtrack(List<List<Integer>> result, ArrayList<Integer> list, int[] nums, int start) {
//        result.add(new ArrayList<>(list));
//
//        for(int i = start; i < nums.length; i++) {
//            list.add(nums[i]);
//            backtrack(result, list, nums, i+1);
//            list.removeLast();
//        }
//    }

    /**
     * 写法2 好理解!
     * [[], [1], [2], [2, 1], [3], [3, 1], [3, 2], [3, 2, 1]]
     * @param args
     */
//    public static void main(String[] args) {
//        int[] nums = new int[]{1,2,3};
//
//        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        int[] flags = new int[3];
//        backtrack(result, new ArrayList<>(), nums, flags);
//        System.out.println(result);
//    }
//
//    public static void backtrack(List<List<Integer>> result, ArrayList<Integer> list, int[] nums,int[] flags) {
//        if(list.size() > 1 && list.getLast() > list.get(list.size()-2)) {
//            return;
//        }
//
//        result.add(new ArrayList<>(list));
//
//        for(int i = 0; i < nums.length; i++) {
//            if(flags[i] == 0) {
//                list.add(nums[i]);
//                flags[i] = 1;
//                backtrack(result, list, nums,flags);
//                list.removeLast();
//                flags[i] = 0;
//            } else {
//                continue;
//            }
//        }
//    }

//    public static void main(String[] args) {
//        int[] nums = new int[]{1,2,2};
//
//        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        int[] flags = new int[3];
//        backtrack(result, new ArrayList<>(), nums, flags);
//        System.out.println(result);
//    }
//
//    public static void backtrack(List<List<Integer>> result, ArrayList<Integer> list, int[] nums,int[] flags) {
//        if(list.size() == nums.length) {
//            result.add(new ArrayList<>(list));
//        }
//
//        for(int i = 0; i < nums.length; i++) {
//            if(i>0&&nums[i]==nums[i-1] && flags[i-1] ==1){//i-1 已经遍历过了, 那么如果i = i-1 他就不用再遍历了!!!!!
//                continue;
//            }
//            if(flags[i] == 0) {
//                list.add(nums[i]);
//                flags[i] = 1;
//                backtrack(result, list, nums,flags);
//                list.removeLast();
//                flags[i] = 0;
//            } else {
//                continue;
//            }
//
//        }
//    }

    /**
     * 无重复 可复选2
     *  [[1, 1, 1], [1, 1, 2], [1, 1, 3], [1, 2, 1], [1, 2, 2], [1, 2, 3], [1, 3, 1], [1, 3, 2], [1, 3, 3], [2, 1, 1], [2, 1, 2], [2, 1, 3], [2, 2, 1], [2, 2, 2], [2, 2, 3], [2, 3, 1], [2, 3, 2], [2, 3, 3], [3, 1, 1], [3, 1, 2], [3, 1, 3], [3, 2, 1], [3, 2, 2], [3, 2, 3], [3, 3, 1], [3, 3, 2], [3, 3, 3]]
     * @param args
     */
//    public static void main(String[] args) {
//        int[] nums = new int[]{1,2,3};
//
//        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        backtrack(result, new ArrayList<>(), nums);
//        System.out.println(result);
//    }
//
//    public static void backtrack(List<List<Integer>> result, ArrayList<Integer> list, int[] nums) {
//        if(list.size() == nums.length) {
//            result.add(new ArrayList<>(list));
//            return;
//        }
//
//        for(int i = 0; i < nums.length; i++) {
//            list.add(nums[i]);
//            backtrack(result, list, nums);
//            list.removeLast();
//        }
//    }

    /**
     * 子集
     * 无重复 可复选 sum
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        backtrack(result, new ArrayList<>(), nums, 0);
        System.out.println(result);
    }

    public static void backtrack(List<List<Integer>> result, ArrayList<Integer> list, int[] nums, int start) {
        result.add(new ArrayList<>(list));

        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            backtrack(result, list, nums, i);
            list.removeLast();
        }
    }
}
