package com.leetcode.strings;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumSizeSubarraySumTest {

    @Test
    public void minSubArrayLen() {
        MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum();
        Assert.assertEquals(2, minimumSizeSubarraySum.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
        Assert.assertEquals(3, minimumSizeSubarraySum.minSubArrayLen(11, new int[]{1,2,3,4,5}));
    }
}