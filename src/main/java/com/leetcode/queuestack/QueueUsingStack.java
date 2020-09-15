package com.leetcode.queuestack;

import java.util.Stack;

/**
 * User: Rahul Reddy
 * Date: 9/14/2020
 * Time: 2:11 PM
 */

public class QueueUsingStack {

    /**
     * Initialize your data structure here.
     */
    Stack<Integer> stack = null;
    Stack<Integer> tempStack = null;

    public QueueUsingStack() {
        stack = new Stack<>();
        tempStack = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        int popedElement = 0;
        while (!stack.isEmpty())
            tempStack.push(stack.pop());
        if (!tempStack.isEmpty())
            popedElement = tempStack.pop();
        while (!tempStack.isEmpty())
            stack.push(tempStack.pop());
        return popedElement;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        int peekElement = 0;
        while (!stack.isEmpty())
            tempStack.push(stack.pop());
        if (!tempStack.isEmpty())
            peekElement = tempStack.peek();
        while (!tempStack.isEmpty())
            stack.push(tempStack.pop());
        return peekElement;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack.isEmpty();
    }
}
