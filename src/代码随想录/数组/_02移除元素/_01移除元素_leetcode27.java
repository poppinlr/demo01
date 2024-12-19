package 代码随想录.数组._02移除元素;

public class _01移除元素_leetcode27 {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[] {2,2,2,3,3}, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        int moveIndex = 0;
        int equalCount = 0;

        while (moveIndex < nums.length) {
            if (nums[moveIndex] == val) {//值相等,,跳过值
                 equalCount++;
            } else {//值不等, 记录num
                nums[index] = nums[moveIndex];
                index++;
            }

            moveIndex++;
        }

        return nums.length - equalCount;
    }
}
