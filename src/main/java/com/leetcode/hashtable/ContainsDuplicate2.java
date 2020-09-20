package com.leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Rahul Reddy
 * Date: 9/20/2020
 * Time: 2:58 PM
 */

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            if (map.containsKey(nums[index]) && index - map.get(nums[index]) <= k)
                return true;
            map.put(nums[index], index);
        }
        return false;
    }
}
