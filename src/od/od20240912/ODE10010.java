package od.od20240912;

import java.util.HashMap;
import java.util.Map;

public class ODE10010 {

    /**
     The furthest distance in the world, Is not between life and death, But when I stand in front of you, Yet you don't know that I love you.
     f

     */
    public static void main(String[] args) {
        Map<Character, Map> map = new HashMap<>();

        //build dict
        String input = "";
        int index = 3;

        char c = input.charAt(0);
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == c) {
                count++;
                map.put(c, new HashMap());
            } else {

                count = 1;
                c = input.charAt(i);
            }
        }
    }
}
