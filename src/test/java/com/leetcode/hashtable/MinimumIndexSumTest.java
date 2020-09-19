package com.leetcode.hashtable;

import org.junit.Assert;
import org.junit.Test;

public class MinimumIndexSumTest {

    @Test
    public void findRestaurant() {
        MinimumIndexSum minimumIndexSum = new MinimumIndexSum();
        Assert.assertArrayEquals(new String[]{"Shogun"}, minimumIndexSum.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"}));
        Assert.assertArrayEquals(new String[]{"Shogun"}, minimumIndexSum.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{"KFC", "Shogun", "Burger King"}));
        Assert.assertArrayEquals(new String[]{"KFC", "Burger King", "Tapioca Express", "Shogun"}, minimumIndexSum.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{"KFC", "Burger King", "Tapioca Express", "Shogun"}));
    }
}