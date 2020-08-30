package com.leetcode.strings;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PascalTriangle2Test {

    @Test
    public void getRow() {
        PascalTriangle2 pascalTriangle2 = new PascalTriangle2();
        Assert.assertArrayEquals(Arrays.asList(1,3,3,1).toArray(), pascalTriangle2.getRow(3).toArray());
    }
}