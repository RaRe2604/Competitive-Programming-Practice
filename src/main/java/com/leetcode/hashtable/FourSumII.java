package com.leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Rahul Reddy
 * Date: 9/30/2020
 * Time: 2:52 PM
 */

public class FourSumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (int i : A) {
            for (int j : B) {
                int sum = i + j;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        for (int i : C) {
            for (int j : D) {
                int sum = -1 * (i + j);
                result += map.getOrDefault(sum, 0);
            }
        }
        return result;
    }
}
