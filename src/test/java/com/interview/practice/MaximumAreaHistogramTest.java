package com.interview.practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * User: Rahul Reddy
 * Date: 1/20/2021
 * Time: 4:05 PM
 */
public class MaximumAreaHistogramTest {

    @Test
    public void maximumAreaHistogram() {
        MaximumAreaHistogram maximumAreaHistogram = new MaximumAreaHistogram();
        Assert.assertEquals(12, maximumAreaHistogram.findMaximumAreaHistogram(new int[]{6, 2, 5, 4, 5, 1, 6}));
        Assert.assertEquals(9, maximumAreaHistogram.findMaximumAreaHistogram(new int[]{6, 1, 4, 3, 4, 1}));
        Assert.assertEquals(12, maximumAreaHistogram.findMaximumAreaHistogram(new int[]{6, 5, 4, 3}));
        Assert.assertEquals(9, maximumAreaHistogram.findMaximumAreaHistogram(new int[]{1, 2, 3, 3, 4}));
    }
}