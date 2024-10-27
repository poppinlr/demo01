package od.pre;

public class Leetcode1839 {

    public static void main(String[] args) {
        String word ="aeeeiiiioooauuuaeiou";

        int max = Integer.MIN_VALUE;
        int sEnd = 0;
        char preChar = 'a';

        int sStart = word.indexOf('a');
        int sIndex = sStart;//找到第一个a

        while(sIndex < word.length() && sStart >=0){
            if(word.charAt(sIndex)=='a' && preChar == 'a'){
                sIndex++;
            } else if(word.charAt(sIndex)=='e' && (preChar == 'a'|| preChar == 'e')){
                preChar = 'e';
                sIndex++;
            } else if(word.charAt(sIndex)=='i' && (preChar == 'e' || preChar == 'i')){
                preChar = 'i';
                sIndex++;
            } else if(word.charAt(sIndex)=='o' && (preChar == 'i' || preChar == 'o')){
                preChar = 'o';
                sIndex++;
            } else if(word.charAt(sIndex)=='u' && (preChar == 'o' || preChar == 'u')){
                preChar = 'u';
                sIndex++;
                sEnd = sIndex;
                max = Math.max(max, sEnd-sStart);
            } else {
                preChar = 'a';
                sStart = word.indexOf('a', sIndex);
                sIndex = sStart;
                System.out.println(word.indexOf(sIndex));
            }

        }

//        return Math.max(0, max);
        System.out.println(max);
    }
}
