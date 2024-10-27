package od.od20240912;

import java.util.Scanner;

/**
 * https://fcqian.blog.csdn.net/article/details/126009910
 * 12：06 12:09
 */
public class ODE10024 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();

        int input = 15;
        int count = loop(input, 0);
        System.out.println(count);
    }

    public static int loop(int input, int count) {

        if(input == 1){
            return count;
        } else {
            if (input % 2 == 0) {
                return loop(input/2, count+1);
            } else {
                return Math.min(loop(input-1, count+1), loop(input+1, count+1));
            }
        }
    }
}
