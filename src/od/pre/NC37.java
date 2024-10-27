package od.pre;

import java.util.*;

public class NC37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("],\\[");

        List<int[]> list = new ArrayList<>();
        for (String s : arr) {
            String[] tmpArr = s.replace("[", "").replace("]", "").split(",");
            list.add(new int[]{Integer.parseInt(tmpArr[0]), Integer.parseInt(tmpArr[1])});
        }

        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(i==0){
                result.add(list.get(i));
            } else {
                int[] pre = list.get(i-1);
                int[] cur = list.get(i);
                if(cur[0]> pre[1]){
                    result.add(cur);
                } else {
                    result.remove(result.size()-1);
                    result.add(new int[]{pre[0],cur[1]});
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < result.size(); i++) {
            strList.add("["+result.get(i)[0] + "," + result.get(i)[1]+"]");
        }
        sb.append(String.join(",", strList));
        sb.append("]");

        System.out.println(sb.toString());
    }
}
