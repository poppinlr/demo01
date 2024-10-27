package test;

import java.util.Arrays;
import java.util.Scanner;

public class Class1 {

    public static void main(String[] args) {
        int[] scores = new int []{50, 50, 2, 3};
        int K = 2;

//        System.out.println(4/2);
//
//        Scanner sc = new Scanner(System.in);
//
//        String line = sc.nextLine();
//
//        int i = line.lastIndexOf(",");
//
//        int[] scores =
//                Arrays.stream(line.substring(1, i - 1).split(",")).mapToInt(Integer::parseInt).toArray();
//        int K = Integer.parseInt(line.substring(i + 1));

        findTheStartPosition(scores, K);
    }

    public static void findTheStartPosition (int[] scores, int K) {

        // write code here
        //sort score
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        //获取中位数
        int mid = sortedScores[sortedScores.length/2];

        int min = Integer.MAX_VALUE;
        int result = 0;
        for(int from = 0; from < scores.length; from++) {
            ;
            int sum = scores[from];
            if(from + K -1 >= scores.length) continue;
            for (int i = from + 1; i<= from + K-1; i++){
                sum = sum - scores[i];
            }

            int minus = Math.abs(sum -mid);
            if(minus < min) {
                min = minus;
                result = from;
            }
        }

//        return result;
        System.out.println(""+result);
    }
}
