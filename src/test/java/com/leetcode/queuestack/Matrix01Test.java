package com.leetcode.queuestack;

import org.junit.Assert;
import org.junit.Test;

public class Matrix01Test {

    @Test
    public void updateMatrix() {
        Matrix01 matrix01 = new Matrix01();
        Assert.assertArrayEquals(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}, matrix01.updateMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
        Assert.assertArrayEquals(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 2, 1}}, matrix01.updateMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}}));
    }
}