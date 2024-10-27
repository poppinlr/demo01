package od.pre;

import java.util.Stack;

public class Leetcode1614 {

    public static void main(String[] args) {
        maxDepth("(1+(2*3)+((8)/4))+1");
    }


    public static int maxDepth(String s) {
        int num = 0;
        int max = 0;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if('(' == c){
                if(stack.isEmpty()){
                    num = 1;
                    max = Math.max(max, num);
                } else {
                    char peek = stack.peek();
                    if('(' == peek){
                        num++;
                        max = Math.max(max, num);
                    }
                }
                stack.push(c);
            } else {
                if(')'==c){
                    stack.pop();
                    num--;
                }
            }
        }

        return max;
    }
}
