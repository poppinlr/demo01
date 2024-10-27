package od.pre;

public class Leetcode674 {

    public static void main(String[] args) {

    }

    public static int findLengthOfLCIS(int[] nums) {
        int maxLength = 0;
        int lengthCount = 0;
        int num = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > num){
                lengthCount++;
            } else {
                lengthCount = 0;
            }
            num = nums[i];
            maxLength = Math.max(maxLength, lengthCount);
        }

        return maxLength;
    }
}
