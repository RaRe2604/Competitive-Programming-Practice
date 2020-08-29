package com.leetcode.strings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * User: Rahul Reddy
 * Date: 8/29/2020
 * Time: 5:10 PM
 */

public class ReverseString {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        Stream.of(s).forEach(System.out::print);
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(new char[]{'h','e','l','l','o'});
        System.out.println();
        reverseString.reverseString(new char[]{'H','a','n','n','a','h'});
    }
}
