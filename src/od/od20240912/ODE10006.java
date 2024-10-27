package od.od20240912;

public class ODE10006 {

    /**
     * 吃货
     *  先选
     * 馋嘴
     *  都会选最大的
     *
     *  8  馋嘴
     *  2  吃货
     *  10 吃货
     *  5  馋嘴
     *  7  吃货
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] pizza = new int[]{5,8,2,10,5,7};
        int max = 0;
        for (int i = 0; i < pizza.length; i++) {
            max = Math.max(backtrack(pizza, i, i,0,0), max);
        }

        System.out.println(max);
    }

    public static int backtrack(int[] pizza, int L,int R,int count, int max) {
        if(count == pizza.length/2) {
            return max;
        }

        if(pizza[L] > pizza[R]){
            L = check(L-1, pizza);
        } else {
            R = check(R +1, pizza);
        }

        int maxL = backtrack(pizza, L, check(R +1, pizza) , ++count, max + pizza[check(R +1, pizza)]);
        count--;
        //重置
        //cz 贴边获取最大的
        int maxR = backtrack(pizza, check(L-1, pizza), R, ++count, max + pizza[check(L-1, pizza)]);
        count--;
        //重置
        //cz 贴边获取最大的
        return Math.max(max, Math.max(maxL, maxR));
    }

    public static int check(int i,int[] pizza){
        if(i==-1){
            return pizza.length-1;
        }

        if(i==pizza.length){
            return 0;
        }

        return i;
    }
}
