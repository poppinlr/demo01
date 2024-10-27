package od.pre;

public class HJ29 {

    static char[] lower = new char[] {'z','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y'};
    static char[] upper = new char[] {'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A'};
    static char[] num = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        //正则匹配字符串含有小写字母
//        while (sc.hasNext()) {
//            fun(sc.nextLine());
//        }

        fun("abcdefgh");
    }

    public static void fun(String input){
        boolean containsLowercase = input.matches(".*[a-z].*");
        //加密
        if (containsLowercase) {

            String output = jiami(input);
            System.out.println(output);
        }

        //
        boolean containsUppercase = input.matches(".*[A-Z].*");
        if (containsUppercase) {
            String output = jiemi(input);
        }
    }

    private static String jiami(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = upper[chars[i] - 'a'];
            }
            if(chars[i] >= '0' && chars[i] <= '9') {
                chars[i] = num[(chars[i] - '0' + 1)%9];
            }
        }

        return new String(chars);
    }

    private static String jiemi(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = lower[chars[i] - 'A'];
            }
            if(chars[i] >= '1' && chars[i] <= '9') {
                chars[i] = num[chars[i] - '0' -1];
            } else if(chars[i] == '0') {
                chars[i] = '9';
            }
        }

        return new String(chars);
    }
}
