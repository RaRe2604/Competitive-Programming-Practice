package com.leetcode.hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * User: Rahul Reddy
 * Date: 9/20/2020
 * Time: 11:05 AM
 */

public class IntersectionOfTwoArray2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) intersect(nums2, nums1);

        Map<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums1) numMap.put(num, numMap.getOrDefault(num, 0) + 1);

        int[] result = new int[nums2.length];
        int count = 0;
        for (int index = 0; index < nums2.length; index++) {
            if (numMap.getOrDefault(nums2[index], -1) > 0) {
                result[count++] = nums2[index];
                numMap.put(nums2[index], numMap.get(nums2[index]) - 1);
            }
        }
        return Arrays.copyOf(result, count);
    }
}
