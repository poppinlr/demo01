package od.pre;

import java.util.ArrayList;
import java.util.List;

public class Leetcode77 {
    public static void main(String[] args) {
        combine(4,2);
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();

        int[] flags = new int[n+1];
        for (int i = 0; i < n; i++) {
            list.add(i+1);
        }

        backtrack(1, res, list, flags, k, resultList);
        return res;
    }

    public static void backtrack(int begin, List<List<Integer>> res, List<Integer> list,int[] flags, int k, List<Integer> resultList) {
        if(resultList.size()==k){
            res.add(new ArrayList<>(resultList));
            return;
        }

        for (int i = begin; i < flags.length; i++) {
            if(flags[i]==1){
                continue;
            } else {
                resultList.add(i);
                flags[i] = 1;
            }

            backtrack(i, res, list, flags, k, resultList);
            resultList.removeLast();
            flags[i] = 0;
        }
    }


}
