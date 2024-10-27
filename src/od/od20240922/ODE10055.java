package od.od20240922;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://fcqian.blog.csdn.net/article/details/127260110
 * https://hydro.ac/d/HWOD2023/p/OD220
 */
public class ODE10055 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<Integer> input = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            input.add(i);
        }

        int[] flag = new int[n];

        List<List<Integer>> result = new ArrayList<>();
        backTrack(result, new ArrayList<Integer>(), input, flag, n);
        System.out.println(result);
    }

    private static void backTrack(List<List<Integer>> result, ArrayList<Integer> list,List<Integer> input, int[] flag, int size) {
        if (list.size() == size) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int index = 0; index < size; index++) {
            if (flag[index] == 0) {
                list.add(input.get(index));
                flag[index] = 1;
                backTrack(result, list, input,flag, size);
                list.removeLast();
                flag[index] = 0;
            }
        }
    }
}
