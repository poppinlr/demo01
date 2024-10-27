package od.pre;

public class KMPContinueTest {

    /**
     * ji
     * abcxabcbab
     * 0123456789
     * 00001230
     *
     * 其中i是一直向前的
     * j是可以左右移动的
     * @param pattern
     * @return
     */
    public static int[] next(char[] pattern) {
        int[] next = new int[pattern.length];

        int j = 0;
        for (int i = 1; i < pattern.length;) {
            if(pattern[j] == pattern[i]) {
                next[i] = j+1;//敲重点！！！
                i++;
                j++;
            } else {
                if(j!=0){
                    j = next[j-1];
                } else {
                    next[i] = 0;
                    i++;
                }
            }
        }
        return next;
    }

    //implement KMP
    public static void KMP(char[] text, char[] pattern){
        int[] next = next(pattern);
        int i = 0, j = 0;
        while (i < text.length && j < pattern.length) {
            if (pattern[j] == text[i]) {
                i++;
                j++;
                if(j==pattern.length){
                    System.out.println(pattern);
                }
            } else {
                if(j!=0){
                    j = next[j-1];
                } else {
                    i++;//易错
                }
            }

            if(j==pattern.length){
                System.out.println(pattern);
                j = next[j-1];
            }
        }
    }

    public static void main(String[] args) {
        char[] text = "abababab".toCharArray();
        char[] pattern = "ababab".toCharArray();

        KMP(text, pattern);
    }
}
