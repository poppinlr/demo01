package 代码随想录.数组._01二分查找;

//https://leetcode.cn/problems/search-insert-position/description/
public class _02插入搜索位置 {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 3));
        System.out.println(searchInsert(new int[]{1,2,5,6}, 5));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 0));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 0));
        //1 3 5 6
        //l m   r
        //

//        System.out.println(3/2);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

}
