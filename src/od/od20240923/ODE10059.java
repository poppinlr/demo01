package od.od20240923;

import java.util.*;

public class ODE10059 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        String str1 = strings[0];
        String str2 = strings[1];
        Comparator<Character> comp = new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1.compareTo(o2);
            }
        };

        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            add(list1, str1.charAt(i), comp);
            add(list2, str2.charAt(i), comp);
        }


        if(list1.equals(list2)) {
            System.out.println(0);
            return;
        }

        if(str2.length()<=str1.length()) {
            System.out.println(-1);
            return;
        }
        for (int i = str1.length(); i < str2.length(); i++) {
            add(list2, str2.charAt(i), comp);
            char remove = str2.charAt(i-str1.length());
            remove(list2, remove, comp);
            if(list1.equals(list2)) {
                System.out.println(i-str1.length()+1);
                return;
            }
        }

        System.out.println(-1);
    }

    public static void add(List<Character> list, Character c, Comparator<Character> comparator) {
        list.add(c);
        list.sort(comparator);
    }

    public static void remove(List<Character> list, Character c, Comparator<Character> comparator) {
        list.remove(c);
        list.sort(comparator);
    }
}
