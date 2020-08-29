package com.leetcode.strings;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImplementStrTest {

    @Test
    public void strStr() {
        ImplementStr implementStr = new ImplementStr();
        Assert.assertEquals(2, implementStr.strStr("hello", "ll"));
        Assert.assertEquals(-1, implementStr.strStr("aaaaa", "bba"));
        Assert.assertEquals(0, implementStr.strStr("", ""));
        Assert.assertEquals(-1, implementStr.strStr("", "a"));
        Assert.assertEquals(-1, implementStr.strStr("mississippi", "a"));
    }
}