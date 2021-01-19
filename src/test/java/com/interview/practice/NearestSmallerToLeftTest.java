package com.interview.practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * User: Rahul Reddy
 * Date: 1/19/2021
 * Time: 12:41 PM
 */
public class NearestSmallerToLeftTest {

    @Test
    public void findNearestSmallerToLeft() {
        NearestSmallerToLeft nearestSmallerToLeft = new NearestSmallerToLeft();
        Assert.assertArrayEquals(Arrays.asList(-1, 4, -1, 2, 2).toArray(), nearestSmallerToLeft.findNearestSmallerToLeft(new int[]{4, 5, 2, 10, 8}).toArray());
        Assert.assertArrayEquals(Arrays.asList(-1, 1, 1, 2).toArray(), nearestSmallerToLeft.findNearestSmallerToLeft(new int[]{1, 3, 2, 4}).toArray());
    }
}