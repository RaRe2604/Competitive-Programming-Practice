package com.leetcode.strings;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartitionTest {

    @Test
    public void arrayPairSum() {
        ArrayPartition arrayPartition = new ArrayPartition();
        Assert.assertEquals(4, arrayPartition.arrayPairSum(new int[]{1, 4, 3, 2}));
        Assert.assertEquals(9, arrayPartition.arrayPairSum(new int[]{5, 6, 1, 4, 3, 2}));
    }
}