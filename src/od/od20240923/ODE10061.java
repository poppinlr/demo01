package od.od20240923;

import java.util.Arrays;
import java.util.Scanner;

public class ODE10061 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = Integer.parseInt(sc.nextLine());
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        int left = nums[0];

        for (int i = 0; i < inputNum; i++) {
            sum += nums[i];
        }
        int right = sum - left;
        int abs = Math.abs(right - left);
        for (int i = 1; i < inputNum-1; i++) {
            left = left + nums[i];
            right = right - nums[i];
            if(Math.abs(right - left) > abs){
                abs = Math.abs(right - left);
            }
        }

        System.out.println(abs);
    }
}
