package com.interview.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * User: Rahul Reddy
 * Date: 1/19/2021
 * Time: 12:20 PM
 */
public class NearestGreaterToLeft {
    public List<Integer> findNearestGreaterToLeft(int[] input) {
        List<Integer> output = new ArrayList<>(input.length);
        Stack<Integer> stack = new Stack<>();

        for (int value : input) {
            if (stack.isEmpty())
                output.add(-1);
            else if (stack.peek() > value)
                output.add(stack.peek());
            else if (stack.peek() <= value) {
                while (!stack.isEmpty() && stack.peek() <= value) {
                    stack.pop();
                }
                output.add(stack.isEmpty() ? -1 : stack.peek());
            }
            stack.push(value);
        }

        return output;
    }
}
