package com.leetcode.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * User: Rahul Reddy
 * Date: 8/30/2020
 * Time: 12:27 PM
 */

public class ReverseWord3 {
    public String reverseWords(String s) {
        String[] result = s.split("\\s+");
        return Arrays.stream(result).map(value -> new StringBuilder(value).reverse() + " ").collect(Collectors.joining()).trim();
    }
}
