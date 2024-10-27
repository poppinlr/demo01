package od.pre;

public class NC149 {

    public static int[] next(char[] pattern) {
        int[] next = new int[pattern.length];

        int j = 0;
        for (int i = 1; i < pattern.length; ) {
            if (pattern[j] == pattern[i]) {
                next[i] = j + 1; // 敲重点！！！
                i++;
                j++;
            } else {
                if (j != 0) {
                    j = next[j - 1];
                } else {
                    next[i] = 0;
                    i++;
                }
            }
        }
        return next;
    }

    // 实现KMP并求字串个数
    public static int KMP(char[] text, char[] pattern) {
        int[] next = next(pattern);
        int i = 0, j = 0;
        int count = 0; // 记录匹配的次数

        while (i < text.length) {
            if (pattern[i] == text[j]) {
                i++;
                j++;
            } else {
                if (j != 0) {
                    j = next[j - 1];
                } else {
                    i++; // 易错
                }
            }

            // 如果匹配成功
            if (j == pattern.length) {
                count++;
                j = next[j - 1]; // 继续寻找下一个匹配
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[] text = "ABABDABACDABABCABAB".toCharArray();
        char[] pattern = "ABABCABAB".toCharArray();
        int count = KMP(text, pattern);
        System.out.println("字串个数: " + count);
    }
}