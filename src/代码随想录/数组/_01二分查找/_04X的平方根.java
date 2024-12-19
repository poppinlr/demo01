package 代码随想录.数组._01二分查找;

//https://leetcode.cn/problems/sqrtx/description/
public class _04X的平方根 {

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
    }

    //1 2
    //l r

    //1 2 3 4
    //l m   r
    //    -
    public static int mySqrt(int x) {
        int left = 1;
        int right = x/2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int sqrt = mid * mid;
            if(sqrt == x) {
                return mid;
            } else if (sqrt < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left - 1;
    }
}
