package com.example.java_tao.leet;

import java.util.Arrays;

public class Solution463 implements Solution {
    @Override
    public void run() {
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(islandPerimeter(grid));
    }

    private int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    perimeter += dfs(i, j, grid, vis);
                }
            }
        }
        return perimeter;
    }

    private int dfs(int row, int col, int[][] grid, boolean[][] vis) {
        int n = grid.length;
        int m = grid[0].length;
        int perimeter = 0;
        vis[row][col] = true;
        int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        for (int[] d : directions) {
            int newRow = row + d[0];
            int newCol = col + d[1];
            if (newRow < 0 || newRow >= n || newCol < 0 || newCol >= m || grid[newRow][newCol] == 0) {
                perimeter++;
            } else if (!vis[newRow][newCol] && grid[newRow][newCol] == 1) {
                perimeter += dfs(newRow, newCol, grid, vis);
            }
        }
        return perimeter;
    }
}
