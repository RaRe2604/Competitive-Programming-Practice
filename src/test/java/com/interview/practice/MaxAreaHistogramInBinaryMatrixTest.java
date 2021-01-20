package com.interview.practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * User: Rahul Reddy
 * Date: 1/20/2021
 * Time: 5:42 PM
 */
public class MaxAreaHistogramInBinaryMatrixTest {

    @Test
    public void findMAHInBinaryMatrix() {
        MaxAreaHistogramInBinaryMatrix maxAreaHistogramInBinaryMatrix = new MaxAreaHistogramInBinaryMatrix();
        Assert.assertEquals(8, maxAreaHistogramInBinaryMatrix.findMAHInBinaryMatrix(new int[][]{
                {1, 0, 0, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 0}
        }));

        Assert.assertEquals(8, maxAreaHistogramInBinaryMatrix.findMAHInBinaryMatrix(new int[][]{
                {1, 0, 0, 1, 1, 1},
                {1, 0, 1, 1, 0, 1},
                {0, 1, 1, 1, 1, 1},
                {0, 0, 1, 1, 1, 1}
        }));
    }
}