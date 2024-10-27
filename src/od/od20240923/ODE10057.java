package od.od20240923;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 */
public class ODE10057 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputStrings = sc.nextLine().split(",");
        int apply = Integer.parseInt(sc.nextLine());

        List<String> output = new ArrayList<>();

        for (int i = 0; i < inputStrings.length; i++) {
            String str = inputStrings[i];
            if(str.contains("-")){
                String[] nums = str.split("-");
                int from  = Integer.parseInt(nums[0]);
                int to  = Integer.parseInt(nums[1]);
                if(apply == from){
                    if(from+1==to){
                        output.add(to+"");
                    } else {
                        output.add(from+1 + "-" + to);
                    }
                } else if(from < apply && apply < to){
                    if (from == apply-1){
                        output.add(from+"");
                    } else if (from != apply-1){
                        output.add(from+ "-" + (apply-1));
                    }

                    if(apply+1==to){
                        output.add(to+"");
                    } else if(apply+1 != to){
                        output.add((apply+1)+"-"+to);
                    }
                } else if (apply == to) {
                    if(from==apply-1){
                        output.add(from+"");
                    } else {
                        output.add(from + "-" + (apply-1));
                    }
                } else {
                    output.add(str);
                }
            } else {
                int num = Integer.parseInt(str);
                if(apply == num){

                } else {
                    output.add(num+"");
                }
            }
        }

        output.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] str1 = o1.split("-");
                String[] str2 = o2.split("-");

                Integer num1 = Integer.parseInt(str1[0]);
                Integer num2 = Integer.parseInt(str2[0]);
                return num1 - num2;
            }
        });

        System.out.println(String.join(",", output));
    }
}
