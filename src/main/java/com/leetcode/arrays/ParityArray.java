package com.leetcode.arrays;

import java.util.Arrays;

public class ParityArray {
    public static int[] sortArrayByParity(int[] A) {
        int evenPointer = 0;
        for (int index = 0; index < A.length; index++) {
            if ((A[index] & 1) == 0) {
                int temp = A[index];
                A[index] = A[evenPointer];
                A[evenPointer] = temp;
                evenPointer++;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] array = {3, 1, 2, 4};
        int[] array1 = {10, 1, 2, 4, 1, 8, 1};
        Arrays.stream(sortArrayByParity(array)).forEach(number -> System.out.print(number + " "));
        System.out.println();
        Arrays.stream(sortArrayByParity(array1)).forEach(number -> System.out.print(number + " "));
    }
}
