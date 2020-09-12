package com.leetcode.queuestack;

import java.util.Stack;

/**
 * User: Rahul Reddy
 * Date: 9/12/2020
 * Time: 11:52 AM
 */

public class DailyTemperature {
    public int[] dailyTemperatures(int[] T) {
        int[] answer = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for (int index = 0; index < T.length; index++) {
            while (!(stack.isEmpty()) && T[index] > T[stack.peek()]) {
                answer[stack.peek()]  = index - stack.pop();
            }
            stack.push(index);
        }
        return answer;
    }
}
