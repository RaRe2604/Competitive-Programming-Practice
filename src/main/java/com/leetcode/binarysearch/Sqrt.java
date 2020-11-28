package com.leetcode.binarysearch;

/**
 * User: Rahul Reddy
 * Date: 11/28/2020
 * Time: 5:36 PM
 */

public class Sqrt {
    public int mySqrt(int x) {
        if (x < 2) return x;
        int low = 1, high = x;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (mid == x / mid)
                return mid;
            else if (mid < x / mid)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return high;
    }
}
