package od.pre;

import java.util.Scanner;

public class HJ65 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sc1 = sc.nextLine();
        String sc2 = sc.nextLine();

        String longSc = sc1.length()>sc2.length()?sc1:sc2;
        String shortSc = sc1.length()>sc2.length()?sc2:sc1;

        System.out.println(longSc);
        System.out.println(longSc.substring(0, longSc.length()));

        for (int i = 0; i < shortSc.length(); i++) {
            int length = shortSc.length() - i;
            for (int start = 0; start + length <= shortSc.length(); start++) {

                String subStr = shortSc.substring(start, start + length);
                if(longSc.contains(subStr)) {
                    System.out.println(subStr);
                    return;
                }
            }
        }
    }
}
