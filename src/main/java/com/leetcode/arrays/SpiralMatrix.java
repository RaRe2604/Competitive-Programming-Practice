package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Rahul Reddy
 * Date: 8/29/2020
 * Time: 9:11 AM
 */

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int r1 = 0, r2 = matrix.length - 1;
        int c1 = 0, c2 = matrix[0].length - 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int column = c1; column <= c2; column++) result.add(matrix[r1][column]);
            for (int row = r1 + 1; row <= r2; row++) result.add(matrix[row][c2]);
            if (r1 < r2 && c1 < c2) {
                for (int column = c2 - 1; column > c1; column--) result.add(matrix[r2][column]);
                for (int row = r2; row > r1; row--) result.add(matrix[row][c1]);
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] input = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        spiralOrder(input).forEach(number -> System.out.print(number + " "));
    }

}
