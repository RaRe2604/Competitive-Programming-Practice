package com.leetcode.problems;


import java.util.Arrays;

/**
 * User: Rahul Reddy
 * Date: 10/5/2020
 * Time: 12:31 PM
 */

public class MissingNumber {
    public int missingNumber(int[] nums) {
        final int totalSum = nums.length * (nums.length + 1) / 2;
        final int arraySum = Arrays.stream(nums).sum();
        return totalSum - arraySum;
    }
}
