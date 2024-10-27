package od.pre;

import java.util.ArrayList;
import java.util.List;

public class Leetcode994 {
    public static void main(String[] args) {
        int[][]  grid = new int[][]{{0}};
        System.out.println(orangesRotting(grid));
    }


    static int good = 0;
    static int cost = 0;

    public static int orangesRotting(int[][] grid) {
        //遍历找到好的橘子数量和坏的橘子节点
        int[][] flags = new int[grid.length][grid[0].length];
        List<int[]> badO = new ArrayList<>();

        //0 空， 1 新鲜橘子， 2坏橘子
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    badO.add(new int[]{i, j});
                } else if (grid[i][j] == 0) {

                } else {
                    good++;
                }
            }
        }

        return bfs(badO, grid, flags);
    }

    private static int[] setValue(int x, int y, int[][] grid, int[][] flags){
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || flags[x][y] == -1){
            return null;
        }
        //好橘子， 好橘子变坏橘子，好橘子数量-1
        //添加到队列 标记为访问过
        //坏橘子，
        //添加到队列，标记为访问过
        //0
        //跳过
        //-1
        //跳过
        int value = grid[x][y];
        flags[x][y] = -1;
        if(value == 1){//好橘子
            grid[x][y] = 2;
            good--;
            //添加到队列
            return new int[]{x, y};
        } else if(value == 2){
            //添加到队列
            return new int[]{x, y};
        } else {
            //
        }

        return null;
    }

    //0 空， 1 新鲜橘子， 2坏橘子
    private static int bfs(List<int[]> badO, int[][] grid, int[][] flags) {
        if(badO.size() == 0){
            return cost;
        }
        if(badO.size() == 0 && good >0){
            return -1;
        }
        cost++;
        List<int[]> newList = new ArrayList<>();
        //坏橘子向四周扩展
        for (int i = 0; i < badO.size(); i++) {

            int x = badO.get(i)[0];
            int y = badO.get(i)[1];
            flags[x][y] = -1;
            //上
            int[] value = setValue(x, y-1, grid, flags);
            if( value!= null){newList.add(value);}
            //下
            value = setValue(x, y+1, grid, flags);
            if( value!= null){newList.add(value);}
            //左
            value = setValue(x-1, y, grid, flags);
            if( value!= null){newList.add(value);}
            //友
            value = setValue(x+1, y, grid, flags);
            if( value!= null){newList.add(value);}
        }
        return bfs(newList, grid, flags);
    }
}
