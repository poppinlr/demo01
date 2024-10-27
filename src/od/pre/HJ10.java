package od.pre;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character,Character> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i),(str.charAt(i)));
        }

        System.out.println(map.size());
    }
}
