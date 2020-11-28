package com.leetcode.binarysearch;

/**
 * User: Rahul Reddy
 * Date: 11/28/2020
 * Time: 5:39 PM
 */

public class GuessNumber {
    private static int guess(int num, int pick) {
        if (num > pick)
            return 1;
        else if (num < pick)
            return -1;
        return 0;
    }

    public int guessNumber(int n, int pick) {
        if (n == 1)
            return n;
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            int result = guess(mid, pick);
            if (result == 0) {
                return mid;
            } else if (result == 1) {
                right = mid - 1;
            } else if (result == -1) {
                left = mid + 1;
            }
        }
        return -1;
    }
}
