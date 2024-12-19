package 代码随想录.数组._01二分查找;

//https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/
public class _03在排序数组中查找元素的第一个和最后一个位置 {

    public static void main(String[] args) {

        searchRange(new int[] {5,7,7,8,8,10}, 8);
        searchRange(new int[] {5,7,7,8,8,10}, 6);
        searchRange(new int[] {1}, 0);
    }

    public static int[] searchRange(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return new int[]{-1,-1};
        }
        int left = left_bound(nums, target);
        int right = right_bound(nums, target);

        return new int[] {left, right};
    }

    public static int left_bound(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left] == target ? left : -1;
    }


    public static int right_bound(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while (left < right) {
            if(left < 0 || left > nums.length-1) return -1;
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if(left ==0) return -1;
        return nums[left -1] == target ? left -1 : -1;
    }

}
