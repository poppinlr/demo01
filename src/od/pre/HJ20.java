package od.pre;

import java.util.Scanner;

public class HJ20 {

    public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // 注意 hasNext 和 hasNextLine 的区别
            while (in.hasNextLine()) { // 注意 while 处理多个 case
                String line = in.nextLine();
                if(line != null && line.length() > 8) {
                    int count = 0;
                    String regex1 = "[A-Z]";
                    String regex2 = "[a-z]";
                    String regex3 = "[0-9]";
                    if(line.matches(regex1)) {
                        count++;
                    }

                    if(line.matches(regex2)) {
                        count++;
                    }

                    if(line.matches(regex3)) {
                        count++;
                    }
                } else {
                    System.out.println("NG");
                }
            }
        }
    }
}
