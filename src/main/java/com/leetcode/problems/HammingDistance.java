package com.leetcode.problems;

/**
 * User: Rahul Reddy
 * Date: 10/5/2020
 * Time: 12:20 PM
 */

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        if (x < y) return hammingDistance(y, x);
        int result = 0;
        while (x > 0) {
            if ((x & 1) != (y & 1)) {
                result++;
            }
            x >>= 1;
            y >>= 1;
        }
        return result;
    }
}
