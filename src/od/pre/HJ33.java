package od.pre;

public class HJ33 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        String str = "10.0.3.193";
        String[] arr = str.split("\\.");
        String output = "";
        for (int i = 0; i < arr.length; i++) {
            //对 arr[i] 做10到2进制的转换
            String binaryString = Integer.toBinaryString(Integer.parseInt(arr[i]));
            System.out.println(binaryString);
//            String _zeroStr = "00000000";
//            int len = binaryString.length();
//            String newBinary = _zeroStr.substring(0,_zeroStr.length()- len) + binaryString;
//            output += newBinary;

        }

        System.out.println(output);
        int newInt = Integer.parseInt(output, 2);

        System.out.println(newInt);
        newInt = 167969729;
        String newIp = "";
        for (int i = 0; i < 4; i++) {
            newIp = newInt%256 + "." +newIp;
            newInt = newInt / 256;
        }

        System.out.println(newIp);
    }

}
