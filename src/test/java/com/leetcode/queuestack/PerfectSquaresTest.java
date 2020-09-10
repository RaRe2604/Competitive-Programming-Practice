package com.leetcode.queuestack;

import org.junit.Assert;
import org.junit.Test;

public class PerfectSquaresTest {

    @Test
    public void numSquares() {
        PerfectSquares perfectSquares = new PerfectSquares();
        Assert.assertEquals(3, perfectSquares.numSquares(12));
    }
}