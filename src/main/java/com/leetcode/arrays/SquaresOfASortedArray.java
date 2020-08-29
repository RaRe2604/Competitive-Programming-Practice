package com.leetcode.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SquaresOfASortedArray {
    public static int[] sortedSquares(int[] A) {
        // return IntStream.of(A).parallel().map(x -> x * x).sorted().toArray();
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }

    public static void main(String[] args) {
        int[] arr1 = {-4, -1, 0, 3, 10};
        int[] arr2 = {-7, -3, 2, 3, 11};

        IntStream.of(sortedSquares(arr1)).forEach(number -> System.out.print(number + " "));
        System.out.println();
        IntStream.of(sortedSquares(arr2)).forEach(number -> System.out.print(number + " "));
    }

}
