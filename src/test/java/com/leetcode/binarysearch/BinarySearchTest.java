package com.leetcode.binarysearch;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void search() {
        BinarySearch binarySearch = new BinarySearch();
        Assert.assertEquals(4, binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        Assert.assertEquals(-1, binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }
}