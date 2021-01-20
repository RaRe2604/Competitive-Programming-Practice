package com.interview.practice;

import java.util.stream.IntStream;

/**
 * User: Rahul Reddy
 * Date: 1/20/2021
 * Time: 6:59 PM
 */
public class RainWaterTrapping {
    public int findRainWaterTrappingAnInt(int[] inputArray) {
        int[] prefixArray = new int[inputArray.length];
        int[] suffixArray = new int[inputArray.length];

        prefixArray[0] = inputArray[0];
        for (int index = 1; index < inputArray.length; index++) {
            prefixArray[index] = Math.max(prefixArray[index - 1], inputArray[index]);
        }
        suffixArray[inputArray.length - 1] = inputArray[inputArray.length - 1];
        for (int index = inputArray.length - 2; index >= 0; index--) {
            suffixArray[index] = Math.max(suffixArray[index + 1], inputArray[index]);
        }
        return IntStream.range(0, inputArray.length).map(index -> Math.min(prefixArray[index], suffixArray[index]) - inputArray[index]).sum();
    }
}
