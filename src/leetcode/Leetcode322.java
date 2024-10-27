package leetcode;

import java.util.Arrays;

public class Leetcode322 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1};

        int[] dp = new int[nums.length];
        dp[0] = 0;

        boolean flag = false;//前一个是否抢劫
        for (int i = 1; i < nums.length; i++) {
            //抢这个 或者这个不抢 抢下一个
            //前一个抢劫了 这个就不能抢劫了
            dp[i] = Math.max(dp[i+1], dp[i+2]+nums[i]);
        }
    }
}
