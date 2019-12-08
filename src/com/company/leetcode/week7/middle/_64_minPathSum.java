package com.company.leetcode.week7.middle;

/**
 * created by Arya on 2019.12.8 12:09
 * 最小路径和
 * */
public class _64_minPathSum {
    public int minPathSum(int[][] grid) {
        for(int i = 0; i < grid.length;i++){
            for(int j = 0; j < grid[0].length;j++){
                if(i == 0 &&j == 0)continue;
                else if(i == 0)grid[i][j] += grid[i][j - 1];
                else if(j == 0)grid[i][j] += grid[i-1][j];
                else{
                    grid[i][j] += Math.min(grid[i-1][j],grid[i][j-1]);
                }
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];

    }
}
