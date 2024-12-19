package 代码随想录.数组._01二分查找;

//https://leetcode.cn/problems/binary-search/description/
public class _01二分查找 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        System.out.println(search(nums, target));

        nums = new int[]{1,2,3,4,6,7,8,9};
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }


}
