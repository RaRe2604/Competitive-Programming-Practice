package com.leetcode.queuestack;

import org.junit.Assert;
import org.junit.Test;

public class FloodFillTest {

    @Test
    public void floodFill() {
        FloodFill floodFill = new FloodFill();
        Assert.assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}}, floodFill.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2));
        Assert.assertArrayEquals(new int[][]{{0,0,0}, {0,1,1}}, floodFill.floodFill(new int[][]{{0,0,0}, {0,1,1}}, 1, 1, 1));


    }
}