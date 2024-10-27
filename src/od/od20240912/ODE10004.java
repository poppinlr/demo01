package od.od20240912;

import java.util.ArrayList;
import java.util.List;

public class ODE10004 {
    /**
     * 小于等于127
     * 包含 大小写 数字 下划线 偶数个“
     * 一个或多个_分割
     *
     */

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int index = sc.nextInt();
//        String str = sc.nextLine();
        /**
         * 2
         *
         */
        String str = "aaa_password_\"a12_45678\"_timeout__100_\"\"_";
        str = str+"_";

        boolean flag = true;
        List<String> strList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            /**
             * 字符是_
             * 是引号里的 append
             * 不是引号里的 切割
             * 或者是”里的字符串
             *
             * 只保留size>0的字符串
             */
            if(str.charAt(i) == '"'){
                flag = !flag;
            }

            if(str.charAt(i) == '_'){
                if(flag){
                    if(sb.length()>0){
                        strList.add(sb.toString());
                    }
                    sb = new StringBuilder();
                } else {
                    sb.append(str.charAt(i));
                }

            } else {
                sb.append(str.charAt(i));
            }
        }


        System.out.println(strList);
    }
}
