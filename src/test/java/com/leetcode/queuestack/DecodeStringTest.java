package com.leetcode.queuestack;

import org.junit.Assert;
import org.junit.Test;

public class DecodeStringTest {

    @Test
    public void decodeString() {
        DecodeString decodeString = new DecodeString();
        Assert.assertEquals("aaabcbc", decodeString.decodeString("3[a]2[bc]"));
        Assert.assertEquals("accaccacc", decodeString.decodeString("3[a2[c]]"));
        Assert.assertEquals("abcabccdcdcdef", decodeString.decodeString("2[abc]3[cd]ef"));
        Assert.assertEquals("abccdcdcdxyz", decodeString.decodeString("abc3[cd]xyz"));
    }
}