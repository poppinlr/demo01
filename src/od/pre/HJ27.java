package od.pre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HJ27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int num = Integer.parseInt(arr[0]);
        String target = arr[num +1];
        String[] strArr = new String[num];
        String[] sortedArr = new String[num];
        for (int i = 0; i < num; i++) {
            if(arr[i+1].length() == target.length()){
                strArr[i] = arr[i+1];
                char[] a = strArr[i].toCharArray();
                Arrays.sort(a);
                sortedArr[i] = String.valueOf(a);
            } else {
                sortedArr[i] = strArr[i];
            }

        }


        char[] a = target.toCharArray();
        Arrays.sort(a);
        String sortedTarget =String.valueOf(a);

        List<String> matchList = new ArrayList<String>();
        int end = Integer.parseInt(arr[num +2]);
        for (int i = 0; i < num; i++) {
            if(sortedTarget.equals(sortedArr[i]) &&
                !target.equals(strArr[i])){
                matchList.add(strArr[i]);
            }
        }

        if(end<=matchList.size()){
            System.out.println(matchList.size());
            System.out.println(matchList.get(end-1));
        }
    }
}
