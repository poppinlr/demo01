package od.od20240912;

/**
 * https://fcqian.blog.csdn.net/article/details/127333487
 */
public class ODE10028 {
    public static void main(String[] args) {
        //N 棵胡杨 1-N
        //M 棵未能成活
        //补种K棵
        //1 ？ 3 ？ 5
        //  0   0     0   0
        //1 ? 3 ? 5 6 ? 8 9 10
        //

        int N = 10;
        int[] M = new int[]{2,4,7};
        int k = 1;
        // 从第i棵开始补种 中到i+k

        int max = 0;
        for (int i = 0; i < M.length; i++) {
            int start = 0;
            int end = 0;
            if (i==0){
                start = 0;
                end = M[i+k]-1;
            } else if(i==M.length-1){
                start = M[i-k]+1;
                end = N-1;
            } else {
                if(i-k <0 || i+k > M.length-1){
                    continue;
                } else {
                    start = M[i-k]+1;
                    end = M[i+k]-1;
                }
            }
            max = Math.max(max, end-start+1);
        }
        System.out.println(max);
    }
}
