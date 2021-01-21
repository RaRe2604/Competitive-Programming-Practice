package com.interview.practice;

import java.util.Stack;

/**
 * User: Rahul Reddy
 * Date: 1/21/2021
 * Time: 6:49 PM
 */
public class MinStack {
    Stack<Integer> mainStack;
    Stack<Integer> supportStack;

    public MinStack() {
        mainStack = new Stack<>();
        supportStack = new Stack<>();
    }

    public void push(int number) {
        if (mainStack.isEmpty() || supportStack.peek() >= number) {
            supportStack.push(number);
        }
        mainStack.push(number);
    }

    public int pop() {
        if (supportStack.isEmpty())
            return -1;
        int mainPopElement = mainStack.pop();
        return supportStack.peek() == mainPopElement ? supportStack.pop() : mainPopElement;
    }

    public int min() {
        if (supportStack.isEmpty())
            return -1;
        return supportStack.peek();
    }
}
