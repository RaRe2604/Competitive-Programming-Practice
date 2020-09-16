package com.leetcode.hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * User: Rahul Reddy
 * Date: 9/16/2020
 * Time: 6:55 PM
 */

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }
}
