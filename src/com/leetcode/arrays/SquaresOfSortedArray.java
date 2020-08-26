package com.leetcode.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SquaresOfSortedArray {

    public static int[] sortedSquares(int[] A) {
//		return IntStream.of(A).parallel().map(x -> x * x).sorted().toArray();
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }

    public static void main(String[] args) {
        int[] numbes = {-4, -1, 0, 3, 10};
        IntStream.of(sortedSquares(numbes)).forEach(System.out::println);
    }
}
