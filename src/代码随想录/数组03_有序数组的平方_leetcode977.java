package 代码随想录;

import java.util.Arrays;

public class 数组03_有序数组的平方_leetcode977 {

    public static void main(String[] args) {
        sortedSquares(new int[]{-4,-3,-2,1,2,3,4});
    }

    public static int[] sortedSquares(int[] nums) {

        //[-4,-2, -2, 1,3]
        int[] newNums = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int newIndex = nums.length - 1;
        while (newIndex>=0) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare < rightSquare) {
                newNums[newIndex] = rightSquare;
                right--;
                newIndex--;
            } else {
                newNums[newIndex] = leftSquare;
                left++;
                newIndex--;
            }
        }

        return newNums;
    }
}
