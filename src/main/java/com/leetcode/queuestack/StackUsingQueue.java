package com.leetcode.queuestack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * User: Rahul Reddy
 * Date: 9/14/2020
 * Time: 2:39 PM
 */

public class StackUsingQueue {
    Queue<Integer> queue = null;

    public StackUsingQueue() {
        queue = new LinkedList<Integer>();
    }

    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);

        int size = queue.size();
        while (size-- > 1)
            queue.add(queue.poll());
    }

    // Removes the element on top of the stack.
    public int pop() {
        return queue.poll();
    }

    // Get the top element.
    public int top() {
        return queue.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }

}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */