package com.leetcode.strings;

/**
 * User: Rahul Reddy
 * Date: 8/29/2020
 * Time: 4:07 PM
 */

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0].length() == 0)
            return "";
        StringBuilder builder = new StringBuilder();
        int minimum = Integer.MAX_VALUE;
        for (int index = 0; index < strs.length; index++) {
            minimum = Math.min(minimum, strs[index].length());
        }
        for (int index = 0; index < minimum; index++) {
            char character = strs[0].charAt(index);
            for (int i = 1; i < strs.length; i++) {
                if (character != strs[i].charAt(index)) {
                    return builder.toString();
                }
            }
            builder.append(character);
        }
        return builder.toString();
    }
}
