package com.leetcode.arrays;

public class EvenNumberOfDigits {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        // return (int) IntStream.of(nums).parallel().filter(number ->
        // EvenNumberOfDigits.lengthOfNumber((int)number) % 2 == 0).count();
        int result = 0;
        for (int number : nums) {
            if ((lengthOfNumber(number) & 1) == 0)
                result++;
        }
        return result;
    }

    public static int lengthOfNumber(int number) {
        int length = 0;
        while (number > 0) {
            length++;
            number = number / 10;
        }
        return length;
    }

}
