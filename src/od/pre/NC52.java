package od.pre;

import java.util.Scanner;
import java.util.Stack;

public class NC52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if('(' == c || '[' == c || '{' == c){
                stack.push(c);
            } else {
                if(stack.isEmpty()){
//                    return false;
                } else {
                    char peek = stack.peek();
                    if(peek == '(' && c ==')'
                            || peek == '[' && c ==']'
                            || peek == '{' && c =='}'){
                        stack.pop();
                    } else {
//                        return false;
                    }
                }

            }
        }

        if(stack.isEmpty()){
//            return true;
        } else {
//            return false;
        }
    }
}
