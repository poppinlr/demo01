package od.od20240912;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ODE10034 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArray = sc.nextLine().split(" ");

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < inputArray.length; i++) {
            if("2".equals(inputArray[i])) {
                continue;
            } else if("J".equals(inputArray[i])) {
                list.add(11);
            } else if("Q".equals(inputArray[i])) {
                list.add(12);
            } else if("K".equals(inputArray[i])) {
                list.add(13);
            } else if("A".equals(inputArray[i])) {
                list.add(14);
            } else {
                list.add(Integer.parseInt(inputArray[i]));
            }
        }

        list.sort(Integer::compareTo);

        List<Integer> result = new ArrayList<>();
        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(result.size()==0){
                result.add(list.get(i));
            } else if(list.get(i).equals(list.get(i - 1))) {
                continue;
            } else {
                if(list.get(i) == list.get(i-1)+1){
                    result.add(list.get(i));
                } else {
                    if(result.size()>=5){
                        results.add(result);
                    }
                    result = new ArrayList<>();
                    result.add(list.get(i));
                }
            }
        }
        if(result.size()>=5){
            results.add(result);
        }
        System.out.println(results);
    }
}
