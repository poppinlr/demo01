package od.od20240912;

import java.util.*;

public class ODE10011 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        /**
         * AAAAHHHBBCDHHHH
         * 3
         * 读题！
         */
        //build dict
        String input = "ABC";
        int index = 2;

        char c = input.charAt(0);
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == c) {
                count++;
            } else {
                count = 1;
                c = input.charAt(i);
            }

            map.put(c, Math.max(map.getOrDefault(c, 0), count));
        }

        //AHBCD
        //
    }
}
