package com.leetcode.hashtable;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicate2Test {

    @Test
    public void containsNearbyDuplicate() {
        ContainsDuplicate2 containsDuplicate2 = new ContainsDuplicate2();
        Assert.assertTrue(containsDuplicate2.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        Assert.assertTrue(containsDuplicate2.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        Assert.assertFalse(containsDuplicate2.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
        Assert.assertTrue(containsDuplicate2.containsNearbyDuplicate(new int[]{99, 99}, 2));
    }
}