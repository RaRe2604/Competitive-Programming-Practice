package com.leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Rahul Reddy
 * Date: 9/17/2020
 * Time: 11:58 AM
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            map.put(target - nums[index], index);
        }

        for (int index = 0; index < nums.length; index++) {
            if (map.containsKey(nums[index]) && map.get(nums[index]) != index) {
                return new int[]{index, map.get(nums[index])};
            }
        }
        return null;
    }
}
