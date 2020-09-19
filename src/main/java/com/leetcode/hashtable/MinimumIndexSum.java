package com.leetcode.hashtable;

import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Rahul Reddy
 * Date: 9/17/2020
 * Time: 2:45 PM
 */

public class MinimumIndexSum {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int index = 0; index < list1.length; index++) {
            map.put(list1[index], index);
        }
        int minimum = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();
        for (int index = 0; index < list2.length; index++) {
            if (map.containsKey(list2[index])) {
                int sum = index + map.get(list2[index]);
                if (sum > minimum) {
                    continue;
                }
                if (sum < minimum) {
                    minimum = sum;
                    result.clear();
                }
                result.add(list2[index]);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
