package od.od20240912;

import java.util.Scanner;

public class ODE10009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 12;
        String str = "12abc-abCABc4aB@";
        int first_ = str.indexOf("-");
        int index = first_;
        str = str.replace("-","");
        while (index<str.length()) {
            String substring = str.substring(index, Math.min(index+num, str.length()));
            index = index +num;

            System.out.println(substring);
        }



    }
}
