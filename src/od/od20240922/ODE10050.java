package od.od20240922;

import java.util.Arrays;
import java.util.Scanner;

public class ODE10050 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr1 = sc.nextLine().split(" ");
        int n = Integer.parseInt(arr1[0]);
        int m = Integer.parseInt(arr1[1]);
        int[] arr = new int[n+1];
        Arrays.fill(arr, -1);
        for (int i = 0; i < m; i++) {
            String[] arrInput = sc.nextLine().split(" ");
            int num1 = Integer.parseInt(arrInput[0]);
            int num2 = Integer.parseInt(arrInput[1]);
            int c = Integer.parseInt(arrInput[2]);
            if(num1>n || num2 >n || num1<1 || num2<1){
                System.out.println("da pian zi");
                continue;
            }
            if(c==0){//表示相同
                if(arr[num1]==-1 && arr[num2]==-1){
                    arr[num1]=num1;
                    arr[num2]=num1;
                } else {
                    if(arr[num1]==-1){
                        arr[num1]=arr[num2];
                    } else {
                        arr[num2]=arr[num1];
                    }
                }
            } else if(c==1){//check
                if(arr[num1] == arr[num2] && arr[num1] != -1){//相同
                    System.out.println("we are a team");
                } else {
                    System.out.println("we are not a team");
                }
            } else {
                System.out.println("da pian zi");
            }
        }
    }
}
