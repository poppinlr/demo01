package od.od20240912;
//
import java.util.Scanner;

public class ODE10016 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String[] arr1 = str1.split(" ");
        int N = Integer.parseInt(arr1[0]);
        int E = Integer.parseInt(arr1[1]);

        int x = 0;
        int y = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            int newX =  Integer.parseInt(arr[0]);
            int newY =  Integer.parseInt(arr[1]);
            System.out.println(newX - x + "*" + Math.abs(y));
            sum = sum + (newX - x) * Math.abs(y);
            x = newX;
            y = newY + y;
        }

        if(E > x){
            sum = sum + (E - x)*Math.abs(y);
        }

        System.out.println(sum);
    }
}


//import java.util.Scanner;
//
//public class ODE10016 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int end_x = sc.nextInt();
//
//        // 记录题解
//        long ans = 0;
//
//        long last_x = 0; // 上一个点的横坐标
//        long last_y = 0; // 上一个点的纵坐标
//
//        // 获取n行输入
//        for (int i = 0; i < n; i++) {
//            int cur_x = sc.nextInt(); // 当前点的横坐标
//            int offset_y = sc.nextInt(); // 当前点纵坐标相较于上一个点纵坐标的偏移量
//
//            // cur_x - last_x 结果是上一个点到当前点的横向距离, 这个距离过程中，高度保持为abs(last_y)
//            System.out.println((cur_x - last_x) + " * " + last_y);
//            ans += (cur_x - last_x) * Math.abs(last_y);
//
//            // 更新last_x, last_y
//            last_x = cur_x;
//            last_y += offset_y;
//        }
//
//        // 注意结束位置的处理
//        if (end_x > last_x) {
//            ans += (end_x - last_x) * Math.abs(last_y);
//        }
//
//        System.out.println(ans);
//    }
//}
