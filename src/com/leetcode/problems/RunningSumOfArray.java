package com.leetcode.problems;

import java.util.stream.IntStream;

/**
 * User: Rahul Reddy
 * Date: 8/28/2020
 * Time: 8:28 PM
 * 1480. Running Sum of 1d Array
 */

public class RunningSumOfArray {
    public static int[] runningSum(int[] nums) {
        for (int index = 1; index < nums.length; index++) {
            nums[index] += nums[index - 1];
        }
//        IntStream.range(1, nums.length).parallel().forEachOrdered(index -> nums[index] += nums[index - 1]);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        IntStream.of(runningSum(nums)).forEach(number -> System.out.print(number + " "));
    }
}
