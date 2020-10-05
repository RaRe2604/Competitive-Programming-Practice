package com.leetcode.problems;

/**
 * User: Rahul Reddy
 * Date: 10/5/2020
 * Time: 1:34 PM
 */

public class ReverseBits {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }
        return result;
    }
}
