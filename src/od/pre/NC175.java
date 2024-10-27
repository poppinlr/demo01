package od.pre;

import java.util.Stack;

public class NC175 {

    public static void main(String[] args) {

    }

    public boolean isValidString (String s) {
        char[] chars = s.toCharArray();
        int starNum = 0;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '*') {
                starNum++;
            } else if (chars[i] == '(') {
                stack.push(chars[i]);
            } else {//')'
                if (stack.isEmpty()){
                    if(starNum>0){
                        starNum--;
                    } else {
                        return false;
                    }
                } else {
                    char pre = stack.peek();
                    if(pre == '('){
                        stack.pop();
                    } else {
                        if(starNum>0){
                            starNum--;
                        }
                    }
                }

            }
        }
        // write code here
        if(stack.size()<=starNum){
            return true;
        } else {
            return false;
        }
    }
}
