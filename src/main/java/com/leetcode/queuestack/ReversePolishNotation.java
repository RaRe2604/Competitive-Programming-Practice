package com.leetcode.queuestack;

import java.util.Stack;

/**
 * User: Rahul Reddy
 * Date: 9/12/2020
 * Time: 10:50 AM
 */

public class ReversePolishNotation {
    static int performOperation(int number1, int number2, String operation) {
        switch (operation) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                return number1 / number2;
            default:
                return 0;
        }
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+":
                case "-":
                case "*":
                case "/":
                    int number1 = stack.pop();
                    int number2 = stack.pop();
                    stack.push(performOperation(number2, number1, token));
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.empty() ? 0 : stack.pop();
    }
}
