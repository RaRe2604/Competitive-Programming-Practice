package com.interview.practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * User: Rahul Reddy
 * Date: 1/19/2021
 * Time: 12:53 PM
 */
public class NearestSmallerToRightTest {

    @Test
    public void findNearestSmallerToRight() {
        NearestSmallerToRight nearestSmallerToRight = new NearestSmallerToRight();
        Assert.assertArrayEquals(Arrays.asList(2, 2, -1, 8, -1).toArray(), nearestSmallerToRight.findNearestSmallerToRight(new int[]{4, 5, 2, 10, 8}).toArray());
        Assert.assertArrayEquals(Arrays.asList(-1, 2, -1, -1).toArray(), nearestSmallerToRight.findNearestSmallerToRight(new int[]{1, 3, 2, 4}).toArray());
    }
}