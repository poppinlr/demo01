package od.pre;

import java.util.*;

public class 扑克牌顺子 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        String str = "[6,0,2,0,4]";
        String[] input = str.replace("[","").replace("]","").split(",");
        Set<Integer> set = new HashSet<>();
        int zeroCount = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("0")) {
                zeroCount++;
            } else {
                set.add(Integer.parseInt(input[i]));
            }
        }

        if(set.size() + zeroCount == 5) {
            List<Integer> list = new ArrayList<>(set);
            list.sort(Integer::compareTo);
            if(list.get(list.size() - 1)-list.get(0)-1 + zeroCount == 5) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
    }
}
