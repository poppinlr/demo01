package od.pre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HJ48 {

    public static void main(String[] args) {
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//
//        list1.add(1,3);
//        System.out.println(list1);

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();//

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            if(i==0){
                list.add(sc.nextInt());
            } else {
                int nextNum1 = sc.nextInt();
                int nextNum2 = sc.nextInt();
                int index = list.indexOf(nextNum2);
                if(index==list.size()-1){
                    list.add(nextNum1);
                } else {
                    list.add(index+1, nextNum1);
                }

            }
        }


        int delete = sc.nextInt();
        //list get delete index
        for (int i = 0; i < list.size(); i++) {
            if(delete==list.get(i)){
                list.remove(i);
                break;
            }
        }
        System.out.println(list.stream().map(i -> i.toString())
                .collect(Collectors.joining(" ")));
    }
}
