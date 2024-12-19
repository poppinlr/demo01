package 代码随想录.数组._05长度最小的字数组;

public class _01长度最小的字数组_leetcode209 {
    public static void main(String[] args) {
        int val = minSubArrayLen(7, new int[] {1,1,1,1,1,1,1,1});
        System.out.println(val);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = nums[0];
        int max = Integer.MAX_VALUE;
        while (true) {
            if(right == nums.length-1 && sum <target) {
                return max == Integer.MAX_VALUE ? 0 : max;
            }
            if(sum < target) {
                right++;
                sum = sum + nums[right];
            } else {//大于等于了
                max = Math.min(max, right - left+1);
                sum = sum - nums[left];
                left++;
            }
        }
    }
}
