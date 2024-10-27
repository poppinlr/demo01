package od.pre;

import java.util.*;

public class 字符串的排列 {
    public static void main(String[] args) {
        String s = "abc";
        permutation(s);
    }

    public static String[] permutation(String S) {
        char[] arr = S.toCharArray();
        char[] flag = new char[arr.length];
        Set<String> resultSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        backtrack(arr, flag, resultSet, sb);


        return resultSet.toArray(new String[0]);
    }

    /**
     * abc
     * []                                       add arr[0]        [1]        [2]
     * [a]        [b]        [c]                add arr[01][02]   [10][12]   [21] [20]
     * [ab] [ac]  [ba] [bc]  [ca] [cb]
     * [abc]
     * @param arr
     * @param flag
     * @param resultSet
     * @param sb
     */
    public static void backtrack(char[] arr, char[] flag, Set<String> resultSet, StringBuilder sb) {
        if(sb.length() == arr.length) {
            resultSet.add(sb.toString());
            return;
        }

        for(int i = 0; i < arr.length; i++) {
            if(flag[i] == 0){
                flag[i] = 1;
                sb.append(arr[i]);
            } else {
                continue;
            }

            backtrack(arr, flag, resultSet, sb);
            sb.deleteCharAt(sb.length() - 1);
            flag[i] = 0;
        }
    }


}
