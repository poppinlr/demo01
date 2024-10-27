package od.pre;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HJ8 {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(3, 3);
        map.put(2, 2);
        map.put(1, 1);
        map.put(4, 4);
        List<Integer> list = map.keySet().stream().sorted().toList();
        for (Integer key : list) {
            System.out.println(map.get(key));
        }
        
    }
}
