package od.od20240912;

public class ODE10003 {
    public static void main(String[] args) {
        //9进制
        /**
         * 1 -> 0
         * 2 -> 0
         * 3 -> 0
         * 4 -> 0
         * 5 -> 0
         * 6 -> 0
         * 7 -> 0
         * 8 -> 0
         * 9 -> 0
         * 10 -> 9 0
         * 11 -> 9 0
         * 12 -> 9 0
         * 13 -> 9 0
         * 14 -> 9 0
         * 15 -> 9 0
         * 16 -> 9 0
         * 17 -> 9 0
         * 18 -> 9 0
         * 19 -> 9 0
         * 20 -> 9 0
         */

//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();

        /**
         * 9进制转10进制的变体
         */
        System.out.println(Math.pow(9, 0));
        System.out.println(Math.pow(9, 1));
        System.out.println(Math.pow(9, 2));
        String str = "20";
        char[] input = str.toCharArray();
        int total = 0;
        for (int i = input.length-1; i >=0; i--) {
            int num = input[i] - '0';
            if(num>4){
                num = num - 1;
            }
            total = total + (int)(num * Math.pow(9, input.length-1 -i));
            System.out.println(total);
        }

    }
}
