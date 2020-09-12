package com.leetcode.queuestack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversePolishNotationTest {

    @Test
    public void evalRPN() {

        ReversePolishNotation reversePolishNotation = new ReversePolishNotation();
        Assert.assertEquals(9,reversePolishNotation.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        Assert.assertEquals(6,reversePolishNotation.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
        Assert.assertEquals(22,reversePolishNotation.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }
}