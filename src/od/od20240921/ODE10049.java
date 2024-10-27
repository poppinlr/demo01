package od.od20240921;

public class ODE10049 {

    public static void main(String[] args) {
        int n = 3;
        int from = (int)(Math.pow(10,n-1));
        int to = (int)(Math.pow(10,n))-1;

        System.out.println(from + " to " + to);
        for (int i = from; i <= to; i++) {
            //i 153
            int sum = 0;
            int num = i;
            for (int j = 0; j < n; j++) {
                sum = sum + (int)Math.pow(num%10, n);
                num = num/10;
            }

            System.out.println("sum= " + sum + ", i = " + i);
            if(sum == i){
                System.out.println(i);
                return;
            }
        }
    }
}
