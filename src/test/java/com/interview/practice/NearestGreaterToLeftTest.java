package com.interview.practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * User: Rahul Reddy
 * Date: 1/19/2021
 * Time: 12:22 PM
 */
public class NearestGreaterToLeftTest {

    @Test
    public void findNearestGreaterToLeft() {
        NearestGreaterToLeft nearestGreaterToLeft = new NearestGreaterToLeft();
        Assert.assertArrayEquals(Arrays.asList(-1, -1, 3, 3, 3, -1).toArray(), nearestGreaterToLeft.findNearestGreaterToLeft(new int[]{1, 3, 0, 0, 2, 4}).toArray());
        Assert.assertArrayEquals(Arrays.asList(-1, -1, 3, -1).toArray(), nearestGreaterToLeft.findNearestGreaterToLeft(new int[]{1, 3, 2, 4}).toArray());
    }
}