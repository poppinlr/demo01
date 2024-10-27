package od.od20240912;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ODE10019 {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "[bc]";

        //正则表达表示 bc 或者bd regex怎么写
        Pattern pattern = Pattern.compile(str2);
        Matcher matcher = pattern.matcher(str1);
        if(matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.start());
        }
    }
}
