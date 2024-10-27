package od.od20240912;

public class ODE10017 {
    public static void main(String[] args) {
        String str = Integer.toBinaryString(255);
        int _2 = Integer.parseInt(str,2);
        System.out.println(_2);
        int exp = Integer.parseInt(str.substring(1,4),2);
        int mant = Integer.parseInt(str.substring(4),2);

        System.out.println((mant | 0x10)<<(exp+3));
    }
}
