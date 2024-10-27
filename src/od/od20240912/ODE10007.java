package od.od20240912;

import java.util.*;

public class ODE10007 {

    public static void main(String[] args) {
        //id 收入 + 下级收入
        /**
         * id money map
         * 父 子s id map
         *
         */

        /**
5
1 0 100
2 0 199
3 0 200
4 0 200
5 0 200

         */

        Map<Integer, Integer> idMoney = new HashMap<>();
        Map<Integer, List<Integer>> kList = new HashMap<>();
        Set<Integer> topList = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < num; i++) {
            String[] arr = sc.nextLine().split(" ");
            int id = Integer.parseInt(arr[0]);
            int parent = Integer.parseInt(arr[1]);
            int money = Integer.parseInt(arr[2]);
            topList.add(parent);
            topList.remove(id);
            idMoney.put(id, money);
            if(kList.containsKey(parent)){
                List<Integer> list = kList.get(parent);
                list.add(id);
                kList.put(parent, list);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(id);
                kList.put(parent, list);
            }
        }

        int top = new ArrayList<>(topList).get(0);
        int sum = bfs(top, idMoney, kList);
        System.out.println(sum);
    }

    public static int bfs(Integer id, Map<Integer, Integer> idMoney, Map<Integer, List<Integer>> kList) {
        if(kList.containsKey(id)){
            int count = 0;
            count = count + idMoney.getOrDefault(id, 0);
            List<Integer> children = kList.get(id);
            if(children != null && children.size() > 0){
                for(Integer childId : children){
                    count = count + bfs(childId, idMoney, kList)/100 * 15;
                }
            }
            return count;
        } else {
            return idMoney.getOrDefault(id, 0);
        }
    }
}
