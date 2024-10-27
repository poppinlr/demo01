package 代码随想录;

//https://leetcode.cn/problems/binary-search/description/
public class 数组01_二分查找01_leetcode704 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        System.out.println(search(nums, target));

        nums = new int[]{1,2,3,4,6,7,8,9};
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        return findIndex(nums, target, 0, nums.length - 1);
    }

    public static int findIndex(int[] nums, int target, int low, int high) {
        if(low < 0 || high >= nums.length || low > high) return -1;
        if(target<nums[low] || target>nums[high]) return -1;
        int midIndex = (low + high) / 2;
        int midValue = nums[midIndex];
        if (midValue == target) {
            return midIndex;
        } else if (target < midValue) {
            return findIndex(nums, target, low, midIndex - 1);
        } else {
            return findIndex(nums, target, midIndex + 1, high);
        }
    }
}
