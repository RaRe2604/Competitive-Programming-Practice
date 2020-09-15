package com.leetcode.queuestack;

import java.util.Stack;

/**
 * User: Rahul Reddy
 * Date: 9/14/2020
 * Time: 3:35 PM
 */

public class DecodeString {
    public String decodeString(String s) {
        String result = "";
        Stack<String> stack = new Stack<>();
        Stack<Integer> count = new Stack<>();

        int index = 0;
        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                int counter = 0;
                while (Character.isDigit(s.charAt(index))) {
                    counter = (counter * 10) + s.charAt(index) - '0';
                    index++;
                }
                count.push(counter);
            } else if (s.charAt(index) == '[') {
                stack.push(result);
                result = "";
                index++;
            } else if (s.charAt(index) == ']') {
                int counter = count.pop();
                StringBuilder stringBuilder = new StringBuilder(stack.pop());
                for (int i = 0; i < counter; i++) {
                    stringBuilder.append(result);
                }
                result = stringBuilder.toString();
                index++;
            } else {
                result += s.charAt(index);
                index++;
            }
        }
        return result;
    }
}
