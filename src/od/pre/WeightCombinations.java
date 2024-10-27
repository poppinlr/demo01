package od.pre;

import java.util.HashSet;
import java.util.Set;

public class WeightCombinations {
    public static void main(String[] args) {
        int[] weights = {1, 4, 3, 6};
        Set<Integer> possibleWeights = calculatePossibleWeights(weights);
        System.out.println("可以称出的不同重量总数: " + possibleWeights.size());
        System.out.println("所有可能的重量: " + possibleWeights);
    }

    public static Set<Integer> calculatePossibleWeights(int[] weights) {
        Set<Integer> possibleWeights = new HashSet<>();
        possibleWeights.add(0); // 初始状态，不使用任何砝码

        for (int weight : weights) {
            Set<Integer> newWeights = new HashSet<>();
            for (int possibleWeight : possibleWeights) {
                newWeights.add(possibleWeight + weight); // 将当前砝码加入到之前的所有可能重量中
            }
            possibleWeights.addAll(newWeights); // 合并新的可能重量
        }

        return possibleWeights;
    }
}