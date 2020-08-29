package com.leetcode.strings;

/**
 * User: Rahul Reddy
 * Date: 8/29/2020
 * Time: 12:15 PM
 */

public class AddBinary {
    public static String addBinary(String a, String b) {
        boolean carry = false;
        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        StringBuilder builder = new StringBuilder(a);
        int i = a.length() - 1, j = b.length() - 1;
        while (j >= 0) {
            if (builder.charAt(i) == '0' && b.charAt(j) == '0') {
                builder.setCharAt(i, carry ? '1' : '0');
                carry = false;
            } else if (builder.charAt(i) == '1' && b.charAt(j) == '1') {
                builder.setCharAt(i, carry ? '1' : '0');
                carry = true;
            } else {
                builder.setCharAt(i, carry ? '0' : '1');
            }
            i--;
            j--;
        }

        while (carry && i >= 0) {
            if (builder.charAt(i) == '1') {
                builder.setCharAt(i, '0');
                carry = true;
            } else {
                builder.setCharAt(i, '1');
                carry = false;
            }
            i--;
        }
        return carry ? ("1" + builder) : builder.toString();
    }
}
