package com.leetcode.strings;

import org.junit.Assert;
import org.junit.Test;

public class AddBinaryTest {

    @Test
    public void addBinary() {
        Assert.assertEquals("100", AddBinary.addBinary("11", "1"));
        Assert.assertEquals("110", AddBinary.addBinary("101", "1"));
        Assert.assertEquals("10101", AddBinary.addBinary("1010", "1011"));
        Assert.assertEquals("0", AddBinary.addBinary("0", "0"));
    }
}