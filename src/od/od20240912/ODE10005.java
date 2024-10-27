package od.od20240912;

import java.util.*;

public class ODE10005 {

    /**
     * 唯一不重复
     * 31
     * 32 01 00     AE
     * 90 02 00     01 02
     * 30 03 00     AB 32 31
     * 31 02 00     32 33
     * 33 01 00     CC
     *
     * 31
     * 32 01 00 AE 90 02 00 01 02 30 03 00 AB 32 31 31 02 00 32 33 33 01 00 CC
     * @param args
     */
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        String str = "32 01 00 AE 90 02 00 01 02 30 03 00 AB 32 31 31 02 00 32 33 33 01 00 CC";
        String[] strArr = str.split(" ");
        Map<String, List<String>> map = new HashMap<>();
        boolean start = true;
        for (int i = 0; i < strArr.length;) {
            String tag = strArr[i];

            int num1 = Integer.parseInt(strArr[i+1], 16);
            int num2 = Integer.parseInt(strArr[i+2], 16);

            int sum = num1 + num2;
            if(sum > 0) {
                List<String> list = new ArrayList<>();
                for (int j = 0; j < sum; j++) {
                    list.add(strArr[i+3+j]);
                }

                map.put(tag, list);
            }

            i = i+3+sum;
        }
    }
}
