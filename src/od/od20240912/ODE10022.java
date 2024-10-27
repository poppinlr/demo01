package od.od20240912;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ODE10022 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputLength = sc.nextInt();
        int arrNum = sc.nextInt();

        int[] arr = new int[arrNum];
        sc.nextLine();
        List<String[]> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < arrNum; i++) {
            String[] strArr = sc.nextLine().split(",");
            list.add(strArr);
            sum += strArr.length;
        }

        List<String> output = new ArrayList<>();
        int left = 0;
        int i = 0;
        while (output.size() < sum){
            String[] strArr = list.get(i);

            //如果step有遗留，先输出step
            if(left != 0){
                int start = arr[i] + left;
                for (int j = arr[i]; j < Math.min(start, strArr.length); j++) {
                    output.add(strArr[j]);
                    left--;
                    arr[i]++;
                }
            }

            //然后再输出inputLength
            int start = arr[i] + inputLength;
            for (int j = arr[i]; j < Math.min(start, strArr.length); j++) {
                output.add(strArr[j]);
                left--;
                arr[i]++;
            }

            i=(i+1)%arrNum;
        }
        System.out.println(String.join(",", output.subList(0, sum)));
    }
}
