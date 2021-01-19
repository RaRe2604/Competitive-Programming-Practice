package com.interview.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * User: Rahul Reddy
 * Date: 1/19/2021
 * Time: 12:39 PM
 */
public class NearestSmallerToLeft {
    public List<Integer> findNearestSmallerToLeft(int[] input) {
        List<Integer> output = new ArrayList<>(input.length);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < input.length; i++) {
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
        return output;
    }
}
