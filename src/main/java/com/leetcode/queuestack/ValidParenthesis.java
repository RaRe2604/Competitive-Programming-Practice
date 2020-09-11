package com.leetcode.queuestack;

import java.util.Stack;

/**
 * User: Rahul Reddy
 * Date: 9/11/2020
 * Time: 12:11 PM
 */

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char character : s.toCharArray()) {
            switch (character) {
                case '(':
                case '{':
                case '[':
                    stack.push(character);
                    break;
                case ')':
                case '}':
                case ']':
                    if (!stack.isEmpty()) {
                        char popedCharacter = stack.pop();
                        if ((popedCharacter == '(' && character == ')')
                                || (popedCharacter == '{' && character == '}') 
                                || (popedCharacter == '[' && character == ']')) {

                        } else return false;
                    } else {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + character);
            }
        }
        return stack.size() == 0;
    }
}



