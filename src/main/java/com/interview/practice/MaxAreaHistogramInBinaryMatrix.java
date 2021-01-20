package com.interview.practice;

/**
 * User: Rahul Reddy
 * Date: 1/20/2021
 * Time: 5:35 PM
 */
public class MaxAreaHistogramInBinaryMatrix {
    public int findMAHInBinaryMatrix(int[][] inputMatrix) {
        int result = 0;
        MaximumAreaHistogram MAH = new MaximumAreaHistogram();
        int[] histogram = inputMatrix[0];
        for (int rowIndex = 1; rowIndex < inputMatrix.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < inputMatrix[0].length; columnIndex++) {
                histogram[rowIndex] = inputMatrix[rowIndex][columnIndex] == 0 ? 0 : histogram[rowIndex] + 1;
            }
            result = Math.max(result, MAH.findMaximumAreaHistogram(histogram));
        }
        return result;
    }
}
