package od.pre;

import java.util.*;

public class HJ23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int min = Integer.MAX_VALUE;

        List<Character> list = new ArrayList<Character>();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Character c : map.keySet()) {
            if(map.get(c) == min) {
                list.add(c);
            } else if (map.get(c) < min) {
                min = map.get(c);
                list = new ArrayList<>();
                list.add(c);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if(!list.contains(c)) {
                System.out.print(c);
            }
        }
    }
}
