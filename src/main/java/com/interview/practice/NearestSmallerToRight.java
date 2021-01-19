package com.interview.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * User: Rahul Reddy
 * Date: 1/19/2021
 * Time: 12:39 PM
 */
public class NearestSmallerToRight {
    public List<Integer> findNearestSmallerToRight(int[] input) {
        List<Integer> output = new ArrayList<>(input.length);
        Stack<Integer> stack = new Stack<>();

        for (int i = input.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                output.add(-1);
            } else if (stack.peek() < input[i]) {
                output.add(stack.peek());
            } else {
                while (!stack.isEmpty() && stack.peek() >= input[i]) {
                    stack.pop();
                }
                output.add(stack.isEmpty() ? -1 : stack.peek());
            }
            stack.push(input[i]);
        }
        Collections.reverse(output);
        return output;
    }
}
