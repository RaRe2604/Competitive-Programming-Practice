package com.leetcode.queuestack;

/**
 * User: Rahul Reddy
 * Date: 9/5/2020
 * Time: 11:08 AM
 */

public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    markNeighbour(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private static void markNeighbour(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
            return;
        if (grid[i][j] == '1') {
            grid[i][j] = '0';
            markNeighbour(grid, i + 1, j);
            markNeighbour(grid, i - 1, j);
            markNeighbour(grid, i, j + 1);
            markNeighbour(grid, i, j - 1);
        }
    }
}
