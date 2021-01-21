package com.interview.practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * User: Rahul Reddy
 * Date: 1/21/2021
 * Time: 6:54 PM
 */
public class MinStackTest {

    @Test
    public void findMin() {
        MinStack minStack = new MinStack();
        minStack.push(10);
        minStack.push(20);
        minStack.push(5);
        Assert.assertEquals(5, minStack.min());
        minStack.pop();
        minStack.push(15);
        minStack.push(50);
        Assert.assertEquals(10, minStack.min());
        minStack.push(5);
        Assert.assertEquals(5, minStack.min());
        minStack.push(7);
        minStack.pop();
        minStack.push(1);
        Assert.assertEquals(1, minStack.min());
        minStack.pop();
        Assert.assertEquals(5, minStack.min());
    }
}