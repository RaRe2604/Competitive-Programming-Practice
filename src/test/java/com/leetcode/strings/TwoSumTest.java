package com.leetcode.strings;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void twoSum() {
        TwoSum twoSum = new TwoSum();
        Assert.assertArrayEquals(new int[]{1,2} , twoSum.twoSum(new int[]{2,7,11,15}, 9));
        Assert.assertArrayEquals(new int[]{1,2} , twoSum.twoSum(new int[]{0,0,3,4}, 0));
        Assert.assertArrayEquals(new int[]{1,2} , twoSum.twoSum(new int[]{-3,3,4,90}, 0));
    }
}