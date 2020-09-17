package com.leetcode.hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * User: Rahul Reddy
 * Date: 9/17/2020
 * Time: 11:05 AM
 */

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> visitedSet = new HashSet<>();
        while (true) {
            int result = 0;
            while (n > 0) {
                int rem = n % 10;
                result += rem * rem;
                n /= 10;
            }
            if (result == 1) return true;
            if (visitedSet.contains(result)) return false;
            visitedSet.add(result);
            n = result;
        }
    }
}
