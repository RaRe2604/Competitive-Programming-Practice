package com.leetcode.strings;

import java.util.Arrays;

/**
 * User: Rahul Reddy
 * Date: 8/29/2020
 * Time: 6:52 PM
 */

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0;i<nums.length;i+=2)
            sum += nums[i];
        return sum;
    }
}
