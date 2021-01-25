package work1_23;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 给你一个 m 行 n 列的二维网格 grid 和一个整数 k。你需要将 grid 迁移 k 次。
 * 每次「迁移」操作将会引发下述活动：
 * 位于 grid[i][j] 的元素将会移动到 grid[i][j + 1]。
 * 位于 grid[i][n - 1] 的元素将会移动到 grid[i + 1][0]。
 * 位于 grid[m - 1][n - 1] 的元素将会移动到 grid[0][0]。
 * 请你返回 k 次迁移操作后最终得到的 二维网格。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shift-2d-grid
 * User: starry
 * Date: 2021 -01 -23
 * Time: 11:06
 */
public class Work3 {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] newgrid = new int[m][n];
        while(k!=0){

            //条件一：位于 grid[i][j] 的元素将会移动到 grid[i][j + 1]
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(j+1>=n){
                        continue;
                    }
                    newgrid[i][j+1] = grid[i][j];
                }
            }

            //条件二：位于 grid[i][n - 1] 的元素将会移动到 grid[i + 1][0]
            for(int i=0;i<m;i++){
                if(i+1>=m){
                    continue;
                }
                newgrid[i+1][0] = grid[i][n-1];
            }

            //条件三：位于 grid[m - 1][n - 1] 的元素将会移动到 grid[0][0]
            newgrid[0][0] = grid[m-1][n-1];

            //将newgrid里的值放回到grid中
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    grid[i][j] = newgrid[i][j];
                }
            }

            k--;
        }

        //复制到新的链表当中
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> listrow = new ArrayList<>();
            result.add(listrow);
            for(int j=0;j<n;j++){
                listrow.add(grid[i][j]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] grid = {{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}};
        int k = 4;
        Work3 a = new Work3();
        List<List<Integer>> result = a.shiftGrid(grid,k);
        Iterator it1 = result.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }
}
