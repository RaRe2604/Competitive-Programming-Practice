package com.interview.practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * User: Rahul Reddy
 * Date: 1/19/2021
 * Time: 1:17 PM
 */
public class StockSpanTest {

    @Test
    public void findStockSpan() {
        StockSpan stockSpan = new StockSpan();
        Assert.assertArrayEquals(Arrays.asList(1, 1, 1, 2, 1, 4, 6).toArray(), stockSpan.findStockSpan(new int[]{100, 80, 60, 70, 60, 75, 85}).toArray());
    }
}