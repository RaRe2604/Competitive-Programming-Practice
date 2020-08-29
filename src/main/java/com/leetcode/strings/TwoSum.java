package com.leetcode.strings;

/**
 * User: Rahul Reddy
 * Date: 8/29/2020
 * Time: 7:07 PM
 */

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int tailPointer = numbers.length - 1;
        int headPointer = 0;
        while (headPointer < tailPointer) {
            int sum = numbers[headPointer] + numbers[tailPointer];
            if (target == sum) {
                return new int[]{headPointer + 1, tailPointer + 1};
            } else if (sum > target)
                tailPointer--;
            else if (sum < target)
                headPointer++;
        }
        return new int[]{0, 0};
    }
}
