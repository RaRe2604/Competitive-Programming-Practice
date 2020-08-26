package com.leetcode.arrays;

import java.util.stream.IntStream;

public class DiagonalTraverse {
    public static int[] findDiagonalOrder(int[][] matrix) {
        int[] result = new int[matrix.length * 2];
        return result;
    }

    public static void main(String[] args) {
        int[][] input = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        IntStream.of(findDiagonalOrder(input)).forEach(System.out::println);
    }

}
