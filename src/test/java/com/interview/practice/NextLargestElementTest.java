package com.interview.practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * User: Rahul Reddy
 * Date: 1/18/2021
 * Time: 2:40 PM
 */
public class NextLargestElementTest {

    @Test
    public void findNextLargestElement() {
        NextLargestElement nextLargestElement = new NextLargestElement();
        List<Integer> output = nextLargestElement.findNextLargestElement(new int[]{1, 3, 0, 0, 2, 4});
        Assert.assertArrayEquals(Arrays.asList(3, 4, 2, 2, 4, -1).toArray(), output.toArray());
    }
}