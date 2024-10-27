package od.huisu;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class 复习 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        boolean[] flags = new boolean[nums.length];
        backtrack(nums, result, flags, new ArrayList<>());
        System.out.println(result);
    }

    public static void backtrack(int[] nums, List<List<Integer>> result, boolean[] flags, List<Integer> list) {
//        result.add(new ArrayList<>(list));
//
//        for (int i = index; i < nums.length; i++) {
//            if (!flags[i]) {
//                flags[i] = true;
//                list.add(nums[i]);
//                backtrack(nums, result, flags, list, i + 1);
//                flags[i] = false;
//                list.remove(list.size() - 1);
//            }
//        }
//        if(list.size() == nums.length) {
//            result.add(new ArrayList<>(list));
//            return;
//        }
//
//        for(int i = 0; i < nums.length; i++) {
//            if(!flags[i]) {
//                flags[i] = true;
//                list.add(nums[i]);
//                backtrack(nums, result, flags, list);
//                flags[i] = false;
//                list.remove(list.size() - 1);
//            }
//        }

        if(list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
            backtrack(nums, result, flags, list);
            list.remove(list.size() - 1);
        }
    }

    
}
