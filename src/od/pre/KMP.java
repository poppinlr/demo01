package od.pre;

public class KMP {
    /**
     * Compute temporary array to maintain size of suffix which is same as prefix
     * Time/space complexity is O(size of pattern)
     */
    private static int[] next(char pattern[]){
        int [] next = new int[pattern.length];
        int j =0;
        for(int i=1; i < pattern.length;){
            if(pattern[i] == pattern[j]){
                next[i] = j + 1;
                j++;
                i++;
            }else{
                if(j != 0){
                    j = next[j-1];
                }else{
                    next[i] =0;
                    i++;
                }
            }
        }
        return next;
    }

    /**
     * KMP algorithm of pattern matching.
     */
    public static void KMP(char []text, char []pattern){
        //算出next函数
        int next[] = next(pattern);
        int i=0;
        int j=0;
        //根据next函数找出公共字串
        while(i < text.length && j < pattern.length){
            if(text[i] == pattern[j]){
                i++;
                j++;
                if(j == pattern.length){
                    System.out.println("1");
                }
            }else{
                if(j!=0){
                    j = next[j-1];
                }else{
                    i++;
                }
            }
        }
    }

    public static void main(String args[]){

        String str = "abababab";
        String subString = "ababab";
        KMP(str.toCharArray(), subString.toCharArray());

    }
}
