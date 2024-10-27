package od.pre;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class HJ101 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        String[] strArr = sc.nextLine().split(" ");
//        int order = sc.nextInt();

        String[] strArr = "1 2 4 9 3 55 64 25".split(" ");
        int order = 0;

        String str = Arrays.stream(strArr).sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return order == 0? Integer.parseInt(o1)-Integer.parseInt(o2):
                        Integer.parseInt(o2)-Integer.parseInt(o1);
            }
        }).collect(Collectors.joining(" "));

        System.out.println(str);
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i] + " ");
        }
    }
}
