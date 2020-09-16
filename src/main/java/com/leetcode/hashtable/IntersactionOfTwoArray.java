package com.leetcode.hashtable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * User: Rahul Reddy
 * Date: 9/16/2020
 * Time: 7:08 PM
 */

public class IntersactionOfTwoArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        Arrays.stream(nums1).forEach(setA::add);
        Arrays.stream(nums2).forEach(setB::add);
        return setA.size() < setB.size() ? setIntersection(setA, setB) : setIntersection(setB, setA);
    }

    private int[] setIntersection(Set<Integer> setA, Set<Integer> setB) {
        int[] result = new int[setA.size()];
        int index = 0;
        for (Integer s : setA)
            if (setB.contains(s)) result[index++] = s;
        return Arrays.copyOf(result, index);
    }
}
