package com.leetcode.problems;

/**
 * User: Rahul Reddy
 * Date: 9/8/2020
 * Time: 9:48 AM
 */

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
