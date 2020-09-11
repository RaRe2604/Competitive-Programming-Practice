package com.leetcode.queuestack;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesisTest {

    @Test
    public void isValid() {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        Assert.assertTrue(validParenthesis.isValid("()"));
        Assert.assertTrue(validParenthesis.isValid("()[]{}"));
        Assert.assertFalse(validParenthesis.isValid("(]"));
        Assert.assertFalse(validParenthesis.isValid("([)]"));
        Assert.assertTrue(validParenthesis.isValid("{[]}"));
    }
}