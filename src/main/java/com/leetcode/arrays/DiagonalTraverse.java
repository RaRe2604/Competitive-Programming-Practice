package com.leetcode.arrays;

import java.util.stream.IntStream;

public class DiagonalTraverse {
    public static int[] findDiagonalOrder(int[][] matrix) {
        int rows = matrix.length;
        int column = matrix[0].length;
        int length = rows * column;
        int[] result = new int[length];
        boolean up = true;
        for (int index = 0, i = 0, j = 0; index < length; index++) {
            result[index] = matrix[i][j];
            if (up) {
                if (j == column - 1) {
                    i++;
                    up = false;
                } else if (i == 0) {
                    j++;
                    up = false;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (i == rows - 1) {
                    j++;
                    up = true;
                } else if (j == 0) {
                    i++;
                    up = true;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] input = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        IntStream.of(findDiagonalOrder(input)).forEach(System.out::print);
    }
}