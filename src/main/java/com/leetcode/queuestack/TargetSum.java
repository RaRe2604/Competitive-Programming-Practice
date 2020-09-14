package com.leetcode.queuestack;

/**
 * User: Rahul Reddy
 * Date: 9/12/2020
 * Time: 4:28 PM
 */

public class TargetSum {
    int result = 0;

    public int findTargetSumWays(int[] nums, int S) {
        if (nums == null || nums.length == 0) return 0;
        dfs(nums, S, 0, 0);
        return result;
    }

    public void dfs(int[] nums, int S, int current, int index) {
        if (index == nums.length && current == S) {
            result++;
            return;
        }
        if (index < nums.length) {
            dfs(nums, S, current + nums[index], index + 1);
            dfs(nums, S, current - nums[index], index + 1);
        }
    }
}