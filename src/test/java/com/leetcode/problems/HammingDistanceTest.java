package com.leetcode.problems;

import org.junit.Assert;
import org.junit.Test;

public class HammingDistanceTest {

    @Test
    public void hammingDistance() {
        HammingDistance hammingDistance = new HammingDistance();
        Assert.assertEquals(2, hammingDistance.hammingDistance(1, 4));
    }
}