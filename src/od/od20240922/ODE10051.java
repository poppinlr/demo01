package od.od20240922;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * https://fcqian.blog.csdn.net/article/details/127418440
 * https://hydro.ac/d/HWOD2023/p/OD199
 */
public class ODE10051 {

    public static void main(String[] args) {
        Comparator<Map.Entry<Character, Integer>> comparator = new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                if(!Objects.equals(o1.getValue(), o1.getValue())){
                    return o1.getValue() - o1.getValue();
                } else {
                    return o1.getKey()-o2.getKey();
                }
            }
        };
    }
}
