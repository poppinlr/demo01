package od.od20240923;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class ODE10056 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        int[] nums = new int[strs[0].length()];
        for (int i = 0; i < strs[0].length(); i++) {
            nums[i] = Integer.parseInt(strs[0].substring(i, i + 1));
        }

        int num = Integer.parseInt(strs[1]);

        int[] numsCount = new int[10];
        int[] targetCount = new int[10];

        for (int i = 0; i < nums.length; i++) {
            targetCount[nums[i]]++;
        }

        //init numsCount
        for (int i = 1; i <= num; i++) {
            put(numsCount, i);
        }

        if (Arrays.equals(targetCount, numsCount)) {
            System.out.println(1);
        }

        for (int i = num+1; i <= 1000 ; i++) {
            increase(i, numsCount);
            decrease(i-num, numsCount);
            if(Arrays.equals(targetCount, numsCount)) {
                System.out.println(i-num+1);
            }
        }
    }

    public static void increase(int num, int[] nums) {
        while (num>0){
            int tmp = num%10;
            nums[tmp] ++;
            num = num/10;
        }
    }

    public static void decrease(int num, int[] nums) {
        while (num>0){
            int tmp = num%10;
            nums[tmp] --;
            num = num/10;
        }
    }

    public static void put(int[] nums, int num) {
        while (num>0){
            int tmp = num%10;
            nums[tmp] ++;
            num = num/10;
        }
    }
}
