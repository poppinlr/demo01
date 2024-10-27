package od.pre;

public class NC17 {

    public static void main(String[] args) {
        int r = getLongestPalindrome("ababc");
        System.out.println(r);
    }

    public static int getLongestPalindrome (String A) {
        char[] chars = A.toCharArray();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < chars.length; i++) {
            max = Math.max(Math.max(fun(chars, i, i), fun(chars, i, i+1)), max);
        }

        return max;
        // write code here
    }

    public static int fun(char[] chars, int i, int j) {
        while (i >= 0 && j < chars.length && chars[i] == chars[j]) {
            i--;
            j++;
        }

        return j-i-1;
    }
}
