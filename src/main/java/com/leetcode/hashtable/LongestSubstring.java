package com.leetcode.hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * User: Rahul Reddy
 * Date: 9/28/2020
 * Time: 2:00 PM
 */

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int leftPointer = 0, rightPointer = 0;
        int longestSubstring = 0;
        final int length = s.length();
        Set<Character> characterSet = new HashSet<>();
        while (leftPointer < length && rightPointer < length) {
            if (characterSet.add(s.charAt(rightPointer))) {
                rightPointer++;
                longestSubstring = Math.max(longestSubstring, characterSet.size());
            } else {
                characterSet.remove(s.charAt(leftPointer++));
            }
        }
        return longestSubstring;
    }
}