package com.leetcode.arrays;

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int writePointer = 0;
        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != 0) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }
        for (int index = writePointer; index < nums.length; index++) {
            nums[index] = 0;
        }
        Arrays.stream(nums).forEach(number -> System.out.print(number + " "));
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int[] arr1 = {0, 1, 0, 0, 0};
        moveZeroes(arr);
        moveZeroes(arr1);
    }
}
