package od.od20240912;

import java.util.Scanner;

public class ODE10040 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int k = Integer.parseInt(sc.nextLine());

        char char1 = str1.charAt(0);

        if(str1.length()+k > str2.length()){
            System.out.println("-1");
            return;
        }
        int start = str2.indexOf(char1);
        int max = -1;
        while (start != -1) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == str2.charAt(i+start)) {
                    if(i == str1.length()-1) {
                        System.out.println(Math.max(0, start-k));
                        return;
                    }
                } else {
                    start = str2.indexOf(char1, i);
                    break;
                }
            }
        }

        System.out.println("-1");
    }
}
