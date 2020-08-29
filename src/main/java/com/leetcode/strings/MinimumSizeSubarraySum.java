package com.leetcode.strings;

/**
 * User: Rahul Reddy
 * Date: 8/29/2020
 * Time: 8:14 PM
 */

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0)
            return 0;
        int headPointer = 0;
        int tailPointer = 0;
        int sum = 0;
        Integer result = Integer.MAX_VALUE;
        while (headPointer < nums.length && tailPointer <= nums.length) {
            if (sum >= s) {
                result = Math.min(result, tailPointer - headPointer);
                sum -= nums[headPointer++];
            } else {
                if (tailPointer >= nums.length)
                    sum -= nums[headPointer++];
                else
                    sum += nums[tailPointer++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
