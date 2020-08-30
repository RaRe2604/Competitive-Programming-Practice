package com.leetcode.strings;

import java.util.Arrays;

/**
 * User: Rahul Reddy
 * Date: 8/30/2020
 * Time: 12:27 PM
 */

public class ReverseWord {
    public String reverseWords(String s) {
        String[] result = s.split("\\s+");
        StringBuilder builder = new StringBuilder();;
        for (int index = result.length - 1; index >= 0; index--) {
            builder.append(result[index]).append(' ');
        }
        return builder.toString().trim();
    }
}
