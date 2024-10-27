package od.od20240912;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ODE10036 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(","))
                .mapToInt(Integer::parseInt).toArray();
        int sum = sc.nextInt();
        if(nums.length==1 && nums[0]==sum){
            System.out.println("1");
        }
        int left = sum;
        int max = -1;
        int i = 0;
        int j = 0;
        while (i < nums.length){
            if(i==nums.length-1){
                if(left>0){
                    break;
                } else if(left<0){
                    left = left + nums[j];
                    j++;
                } else {
                    left = sum;
                    max = Math.max(max, i-j);
                    break;
                }
            }
            if(left > 0){
                left = left - nums[i];
                i++;
            } else if(left < 0){
                left = left + nums[j];
                j++;
            } else {
                left = sum;
                max = Math.max(max, i-j);
            }
        }

        System.out.println(max);
    }
}
