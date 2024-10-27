package od.pre;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NC28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().replace("\"","").split(",");
        String fatherStr = strArr[0];
        String sonStr = strArr[1];

        int max = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        for (char c: sonStr.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        /**
         * 向右移动1位， 然后在字串后面找到下一个移出去的字母
         */

        int startIndex = -1;
        int endIndex = -1;
        char[] fatherArr = fatherStr.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            if(!map.isEmpty()) {
                if(map.containsKey(fatherArr[i])){
                    if(startIndex == -1){
                        startIndex = i;
                    }

                    int value = map.get(fatherArr[i]);
                    if(value>0){
                        map.put(fatherArr[i], map.get(fatherArr[i]) - 1);
                    } else {
                        map.remove(fatherArr[i]);
                        if(map.isEmpty()){
                            endIndex = i;
                            break;
                        }
                    }
                }
            }
        }

        System.out.println("s: " + startIndex + " e: " + endIndex);
        while (endIndex < fatherStr.length()){
            max = Math.max(max, endIndex-startIndex +1);
            char removeChar = sonStr.charAt(0);
            startIndex = startIndex + 1;
            endIndex = fatherStr.indexOf(removeChar,endIndex +1);
            if(endIndex == -1){
                return;
            }
        }

        System.out.println(max);
    }
}
