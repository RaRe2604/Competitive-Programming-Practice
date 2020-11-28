package com.leetcode.binarysearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {

    @Test
    public void mySqrt() {
        Sqrt sqrt = new Sqrt();
        Assert.assertEquals(2, sqrt.mySqrt(4));
        Assert.assertEquals(2, sqrt.mySqrt(8));
        Assert.assertEquals(3, sqrt.mySqrt(9));
    }
}