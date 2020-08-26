package com.leetcode.arrays;

import java.util.stream.IntStream;

public class PlusOne {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 9, 9};
        IntStream.of(plusOne(numbers)).forEach(System.out::println);
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
