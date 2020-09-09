package com.leetcode.problems;

/**
 * User: Rahul Reddy
 * Date: 9/8/2020
 * Time: 3:44 PM
 */

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int mid) {
        return (mid == 5);
    }
}
