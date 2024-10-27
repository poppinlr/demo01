package od.pre;

import java.util.Scanner;

public class HJ5 {

    static int getNum(Character character){
        if(character<='9' && character>='0') return character - '0';
        return character - 'A' +10;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String num = sc.nextLine();


//            int sum = 0;
//            int length = num.length();
//            for (int i = length-1; i >=2; i--) {
//                sum = sum + (int)(getNum(num.charAt(i))*Math.pow(16, length -i -1));
//            }
            System.out.println(Integer.parseInt(num.substring(2),16));
        }


    }
}
