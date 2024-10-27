package od.od20240912;

import java.util.Arrays;

/**
 * https://fcqian.blog.csdn.net/article/details/127418499
 * https://leetcode.cn/problems/maximum-swap/description/
 */
public class ODE10013 {

    public static void main(String[] args) {
        String str = "abababa";
        char[] arr = str.toCharArray();
        char[] sortedChar = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedChar);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sortedChar[i]) {
                continue;
            } else {
                char sortedC = sortedChar[i];//a
                char c = arr[i];//b
                int index = str.lastIndexOf(sortedC);//last a index
//                char smallC = arr[index];

                arr[i] = sortedC;
                arr[index] = c;

                break;
            }
        }

        System.out.println(new String(arr));
    }
}
