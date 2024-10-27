package od.od20240921;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class ODE10048 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap map = new TreeMap();
        map.keySet().stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
    }
}
