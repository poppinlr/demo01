package test;

import java.util.Arrays;
import java.util.Scanner;

public class Class3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tasks = Integer.parseInt(sc.nextLine());

        int[] flags = new int[Integer.MAX_VALUE];
        for (int i = 0; i < tasks; i++) {
            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = arr[0]; j <= arr[1]; j++) {
                flags[j]++;
            }
        }

        int sum = 0;
        for (int i = 0; i < flags.length; i++) {
            if (flags[i] > 0) {
                sum ++;
            }
        }

        System.out.println(Math.max(sum, tasks));
    }
}
