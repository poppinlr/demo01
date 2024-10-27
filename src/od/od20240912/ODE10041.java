package od.od20240912;

import java.util.Arrays;
import java.util.Scanner;

public class ODE10041 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //商品种类数量
        int items = Integer.parseInt(sc.nextLine());
        //贩卖天数
        int days = Integer.parseInt(sc.nextLine());
        //每个商品可售卖数量
        int[] maxItems = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int i = 0; i < items; i++) {
            int[] prices = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for (int j = 1; j < days; j++) {
                sum = sum + Math.max(prices[j]-prices[j-1],0)*maxItems[i];
            }
        }
        System.out.println(sum);
    }
}
