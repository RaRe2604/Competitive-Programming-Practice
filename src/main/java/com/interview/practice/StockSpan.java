package com.interview.practice;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

/**
 * User: Rahul Reddy
 * Date: 1/19/2021
 * Time: 1:15 PM
 */
public class StockSpan {
    public List<Integer> findStockSpan(int[] input) {
        List<Integer> output = new ArrayList<>(input.length);
        Stack<Pair<Integer, Integer>> stack = new Stack<>();
        for (int i = 0; i < input.length; i++) {
            if (stack.isEmpty())
                output.add(-1);
            else if (stack.peek().getKey() >= input[i]) {
                output.add(stack.peek().getValue());
            } else {
                while (!stack.isEmpty() && stack.peek().getKey() < input[i]) {
                    stack.pop();
                }
                output.add(stack.isEmpty() ? -1 : stack.peek().getValue());
            }
            stack.push(new Pair<>(input[i], i));
        }

        IntStream.range(0, output.size()).forEachOrdered(i -> output.set(i, i - output.get(i)));

        return output;
    }
}
