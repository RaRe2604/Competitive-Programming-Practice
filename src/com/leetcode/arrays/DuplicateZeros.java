package com.leetcode.arrays;

import java.util.stream.IntStream;

public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 2; j > i; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[i + 1] = 0;
                i++;
            }
        }

        IntStream.of(arr).forEach(x -> System.out.print(x + " "));
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        // output : 1,0,0,2,3,0,0,4
        duplicateZeros(arr);
    }
}
