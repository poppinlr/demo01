package od.od20240912;

import java.util.Scanner;

/**
40 3
20 10
20 20
20 5

 */
public class ODE10042 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrs = sc.nextLine().split(" ");
        int T = Integer.parseInt(arrs[0]);
        int n = Integer.parseInt(arrs[1]);

        int[][] works = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] worksArr = sc.nextLine().split(" ");
            works[i][0] = Integer.parseInt(worksArr[0]);
            works[i][1] = Integer.parseInt(worksArr[1]);
        }
        //  0 1 2 3 4 5 6 7
       //[]
       //[]
       //[]
        //dp[n][totalHors] = Math.max(dp[n][totalHors], dp[n-1][totalHours-works[i][0] + works[i][1]]
        //dp[left-]
        int[][] dp = new int[n+1][T+1];
        dp[0][0] = 0;
        for (int i = 1; i < n+1; i++) {
            int t = works[i-1][0];
            int w = works[i-1][1];

            for (int j = 1; j < T+1; j++) {//j 背包剩余大小
                if(t>j) dp[i][j] = dp[i-1][j];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-t]+w);
            }
        }

        System.out.println(dp[n][T]);
    }


}
