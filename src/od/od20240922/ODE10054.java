package od.od20240922;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://fcqian.blog.csdn.net/article/details/128022017
 * https://hydro.ac/d/HWOD2023/p/OD224
 */
public class ODE10054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long x = arr[0];
        long y = arr[1];
        for (int i = 0; i < y; i++) {
            long a = x/26;
            long b = x%26;
            x = a+b;
        }

        System.out.println((""+x).length());
    }
}
