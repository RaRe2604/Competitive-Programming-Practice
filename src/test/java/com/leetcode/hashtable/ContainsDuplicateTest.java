package com.leetcode.hashtable;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateTest {

    @Test
    public void containsDuplicate() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        Assert.assertTrue(containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1}));
        Assert.assertFalse(containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4}));
        Assert.assertTrue(containsDuplicate.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}