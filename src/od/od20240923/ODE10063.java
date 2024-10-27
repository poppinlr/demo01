package od.od20240923;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ODE10063 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Stack<Integer> stack = new Stack<>();

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(stack.isEmpty()){
                stack.push(num);
            } else {
                int peekNum = stack.peek();
                //符号相同 push
                if(num > 0 && peekNum > 0 || num < 0 && peekNum < 0) {
                    stack.push(num);
                } else {//否则搏斗,  搏斗完了还要塞进去 无语
                    //搏斗逻辑, 遇到方向相同或者 逃出或者死亡
                    stack.pop();
                    int absNum = Math.abs(num);
                    int absPeekNum = Math.abs(peekNum);
                    if(absNum == absPeekNum) {

                    } else if(absNum> absPeekNum){
                        if(num > 0){
                            stack.push(Math.abs(absNum - absPeekNum));
                        } else {
                            stack.push(-Math.abs(absNum - absPeekNum));
                        }
                    } else {//absPeekNum > absNum
                        if(peekNum > 0){
                            stack.push(Math.abs(absPeekNum - absNum));
                        } else {
                            stack.push(-Math.abs(absPeekNum - absNum));
                        }
                    }
                }
            }
        }
        while (!stack.isEmpty()){
            stack.pop();
            count++;
        }

        System.out.println(count);
    }
}
