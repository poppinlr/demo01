package od.pre;

import java.util.Scanner;

public class NC68 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int steps = sc.nextInt();
        System.out.println(fn(steps));
    }

    public static int fn(int step){

        //写一个正则表达式匹配 A或者W或者S或者D 加上两位数以内的数字

        if(step == 0){
            return 1;
        } else if(step == 1){
            return 1;
        } else if(step == 2){
            return 2;
        } else {
            return fn(step - 1) + fn(step - 2);
        }
    }
}
