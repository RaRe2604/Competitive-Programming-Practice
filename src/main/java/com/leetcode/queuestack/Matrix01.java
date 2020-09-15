package com.leetcode.queuestack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * User: Rahul Reddy
 * Date: 9/15/2020
 * Time: 2:53 PM
 */

public class Matrix01 {
    public int[][] updateMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return matrix;
        int row = matrix.length;
        int column = matrix[0].length;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }

        final int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] coordinate = queue.poll();
                for (int[] dir : dirs) {
                    int X = coordinate[0] + dir[0];
                    int Y = coordinate[1] + dir[1];
                    if (X < 0 || X >= row || Y < 0 || Y >= column || visited[X][Y])
                        continue;
                    matrix[X][Y] = matrix[coordinate[0]][coordinate[1]] + 1;

                    queue.offer(new int[]{X,Y});
                    visited[X][Y] = true;
                }
            }
        }
        return matrix;
    }
}
