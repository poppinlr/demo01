package od.od20240922;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://fcqian.blog.csdn.net/article/details/127711549
 * https://hydro.ac/d/HWOD2023/p/OD272
 */
public class ODE10052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr =
        Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            list.add(arr[i]);
            int next = arr[i];

            //
            for (int j = i - 1; j>=0; j--) {
                if(next >0){//继续累计
                    next = next-arr[j];
                    if(next == 0) {//相同 去除后面的数
                        for(int k = 0; k < i-j+1; k++){
                            list.removeLast();
                        }
                        list.add(arr[i]*2);
                        break;
                    }
                } else if(next == 0) {//相同 去除后面的数
                    for(int k = 0; k < i-j+1; k++){
                        list.removeLast();
                    }
                    list.add(arr[i]*2);
                    break;
                } else {//跳出循环添加下一个数字
                    break;
                }
            }
        }

        System.out.println(String.join(" ", list.stream().map(String::valueOf).collect(Collectors.toList()).reversed()));
    }
}
