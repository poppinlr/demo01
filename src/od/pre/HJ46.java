package od.pre;

import java.util.Scanner;

public class HJ46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        int i = (int)f;

        if(f>i+0.5f){
            System.out.println(i+1);
        } else {
            System.out.println(i);
        }
    }
}
