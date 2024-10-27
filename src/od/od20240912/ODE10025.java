package od.od20240912;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class ODE10025 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(";");
        double[] arr1 = new double[5];
        double[] arr2 = new double[5];
        double[] arr3 = new double[5];
        List<Double> list1 = Arrays.stream(arr[0].split(",")).map(Double::valueOf).toList();
        List<Double> list2 = Arrays.stream(arr[1].split(",")).map(Double::valueOf).toList();
        List<Double> list3 = Arrays.stream(arr[2].split(",")).map(Double::valueOf).toList();

        List<Integer> list4 = Arrays.stream(arr[3].split(",")).map(Integer::valueOf).toList();
        List<Double> list5 = Arrays.stream(arr[3].split(",")).map(Double::valueOf).toList();

//        boolean flag = test(list1, list4, list5.get(0));
    }

//    public static boolean test(List<Double> list1, List<Integer> list4, Double compare) {
//
//    }
}
