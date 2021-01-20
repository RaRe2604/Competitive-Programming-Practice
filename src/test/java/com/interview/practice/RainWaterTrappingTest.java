package com.interview.practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * User: Rahul Reddy
 * Date: 1/20/2021
 * Time: 7:00 PM
 */
public class RainWaterTrappingTest {

    @Test
    public void findRainWaterTrappingAnInt() {
        RainWaterTrapping rainWaterTrapping = new RainWaterTrapping();
        Assert.assertEquals(10, rainWaterTrapping.findRainWaterTrappingAnInt(new int[]{3, 0, 0, 2, 0, 4}));
        Assert.assertEquals(6, rainWaterTrapping.findRainWaterTrappingAnInt(new int[]{4, 2, 3, 1, 5, 2}));
    }
}