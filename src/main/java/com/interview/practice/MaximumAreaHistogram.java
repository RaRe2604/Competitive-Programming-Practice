package com.interview.practice;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * User: Rahul Reddy
 * Date: 1/20/2021
 * Time: 3:49 PM
 */
public class MaximumAreaHistogram {
    private static List<Integer> NearestSmallerToLeft(int[] input) {
        List<Integer> output = new ArrayList<>();
        Stack<Pair<Integer, Integer>> stack = new Stack<>();

        for (int index = 0; index < input.length; index++) {
            if (stack.isEmpty())
                output.add(-1);
            else if (stack.peek().getKey() < input[index])
                output.add(stack.peek().getValue());
            else {
                while (!stack.isEmpty() && stack.peek().getKey() >= input[index]) {
                    stack.pop();
                }
                output.add(stack.isEmpty() ? -1 : stack.peek().getValue());
            }
            stack.add(new Pair<>(input[index], index));
        }
//        IntStream.range(0, output.size()).forEachOrdered(x -> output.set(x, x - output.get(x)));
        return output;
    }

    private static List<Integer> NearestSmallerToRight(int[] input) {
        List<Integer> output = new ArrayList<>();
        Stack<Pair<Integer, Integer>> stack = new Stack<>();

        for (int index = input.length - 1; index >= 0; index--) {
            if (stack.isEmpty())
                output.add(input.length);
            else if (stack.peek().getKey() < input[index])
                output.add(stack.peek().getValue());
            else {
                while (!stack.isEmpty() && stack.peek().getKey() >= input[index]) {
                    stack.pop();
                }
                output.add(stack.isEmpty() ? input.length : stack.peek().getValue());
            }
            stack.add(new Pair<>(input[index], index));
        }
//        IntStream.range(0, output.size()).forEachOrdered(x -> output.set(x, x - output.get(x)));
        Collections.reverse(output);
        return output;
    }

    public int findMaximumAreaHistogram(int[] input) {

        List<Integer> NSL = MaximumAreaHistogram.NearestSmallerToLeft(input);
        List<Integer> NSR = MaximumAreaHistogram.NearestSmallerToRight(input);

        int result = 0;
        for (int index = 0; index < input.length; index++) {
            result = Math.max(result, input[index] * (NSR.get(index) - NSL.get(index) - 1));
//            System.out.println();
        }

        return result;
    }
}
