package od.pre;

import java.util.Scanner;

public class HJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int[] arr = new int[501];
        while (sc.hasNext()) {
            int num = sc.nextInt();
            arr[num] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                System.out.println(i);
            }
        }
    }
}
