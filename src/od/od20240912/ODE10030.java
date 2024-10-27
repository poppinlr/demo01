package od.od20240912;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ODE10030 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();

        List<Integer> qIndexList = new ArrayList<>();
        List<Integer> uIndexList = new ArrayList<>();
        List<Integer> aIndexList = new ArrayList<>();
        List<Integer> cIndexList = new ArrayList<>();
        List<Integer> kIndexList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 'q'){
                qIndexList.add(i);
            } else if(arr[i] == 'u'){
                uIndexList.add(i);
            } else if(arr[i] == 'a'){
                aIndexList.add(i);
            } else if(arr[i] == 'c'){
                cIndexList.add(i);
            } else if(arr[i] == 'k'){
                kIndexList.add(i);
            }
        }

        List<int[]> quackList = new ArrayList<>();

        for(int i = 0; i < qIndexList.size(); i++){
            int qIndex = qIndexList.get(i);
            int uIndex = find(uIndexList, qIndex);
            int aIndex = find(aIndexList, uIndex);
            int cIndex = find(cIndexList, aIndex);
            int kIndex = find(kIndexList, cIndex);
            if(uIndex!=-1 && aIndex != -1 && cIndex != -1 && kIndex != -1){
                quackList.add(new int[]{qIndex, uIndex, aIndex, cIndex, kIndex});
            } else {

            }
        }
        int max = 0;
        int count = 0;
        //算出大雁叫声
        for(int i = 0; i < quackList.size(); i++){
            int[] quack = quackList.get(i);
            for(int j = 0; j < quackList.size(); j++){
                if(quackList.get(j)[0] >= quack[0] && quackList.get(j)[0] <= quack[4]){
                    count++;
                    max = Math.max(max, count);
                }
            }
            count = 0;
        }

        //算出一个叫声里最多有多少个q

        System.out.println(max==0?-1:max);
    }

    /**
     * find index greater then i and remove index
     * @param arr
     * @param i
     * @return index
     */
    public static int find(List<Integer> arr, int i){
        for (int j = 0; j < arr.size(); j++) {
            if(arr.get(j)>i){
                int result = arr.get(j);
                arr.remove(j);
                return result;
            }
        }

        return -1;
    }
}
