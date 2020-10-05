package com.leetcode.problems;

import org.junit.Assert;
import org.junit.Test;

public class ReverseBitsTest {

    @Test
    public void reverseBits() {
        ReverseBits reverseBits = new ReverseBits();
        Assert.assertEquals(964176192, reverseBits.reverseBits(43261596));
        Assert.assertEquals(-1073741825, reverseBits.reverseBits(-3));
    }
}