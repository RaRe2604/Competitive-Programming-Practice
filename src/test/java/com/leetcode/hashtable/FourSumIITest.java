package com.leetcode.hashtable;

import org.junit.Assert;
import org.junit.Test;

public class FourSumIITest {

    @Test
    public void fourSumCount() {
        FourSumII fourSumII = new FourSumII();
        Assert.assertEquals(2, fourSumII.fourSumCount(new int[]{1, 2}, new int[]{-2, -1}, new int[]{-1, 2}, new int[]{0, 2}));
    }
}