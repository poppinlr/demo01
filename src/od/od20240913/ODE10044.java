package od.od20240913;

import java.util.*;

/**
 * n 个酒店 k 个最接近 x 元的酒店
 */
public class ODE10044 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        int x = Integer.parseInt(arr[2]);
        List<Integer> list = new ArrayList<>();
        int[] prices = new int[n];
        int index = Integer.MAX_VALUE;
        int abs = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
            if (prices[i] - x < abs) {
                abs = Math.abs(prices[i] - x);
                index = i;
            }
        }

        prices = Arrays.stream(prices).sorted().toArray();
        list.add(prices[index]);

        int i = index;
        int j = index;
        while (list.size()<k){
            if(j+1>prices.length-1){
                list.add(prices[prices[i-1]]);
                i = i - 1;
            } else if(i-1<0){
                list.add(prices[ prices[j+1]]);
                j = j +1;
            } else {
                int priceLeft = Math.abs(prices[i-1]-x);
                int priceRight = Math.abs(prices[j+1]-x);
                if (priceLeft <= priceRight){
                    list.add(prices[i-1]);
                    i = i - 1;
                } else {
                    list.add(prices[j +1]);
                    j = j +1;
                }
            }
        }

        Collections.sort(list);
        System.out.println(String.join(" ", list.stream().map(String::valueOf).toList()));
    }
}
