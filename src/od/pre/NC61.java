package od.pre;

import java.util.HashMap;
import java.util.Map;

public class NC61 {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                if (map.get(target - nums[i]) != i) {
                    return new int[]{i,map.get(target - nums[i])};
                }
            }
        }

        return null;
    }
}
