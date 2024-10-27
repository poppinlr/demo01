package od.pre;

import java.util.Scanner;
import java.util.Stack;

public class HJ70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[num][2];
        for (int i = 0; i < num; i++) {
            String[] arrStr = sc.nextLine().split(" ");
            arr[i][0] = Integer.parseInt(arrStr[0]);
            arr[i][1] = Integer.parseInt(arrStr[1]);
        }

        int total = 0;

        char[] express = sc.nextLine().toCharArray();

        int index = 0;
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < express.length; i++) {
            char ch = express[i];
            if (ch == '(') {

            } else if (ch == ')') {
                int[] pop1 = stack.pop();
                int[] pop2 = stack.pop();

                total += pop1[1]*pop2[0]*pop1[0];
                if(stack.isEmpty()){
                    System.out.println(total);
                } else {
                    int[] push = new int[]{pop2[0], pop1[1]};
                    stack.push(push);
                }
            } else {
                stack.push(arr[index]);
                index++;
            }
        }
    }
}
