package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * User: Rahul Reddy
 * Date: 8/29/2020
 * Time: 11:04 AM
 */

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows <= 0) return result;
        result.add(Collections.singletonList(1));
        if (numRows <= 1) return result;
        result.add(Arrays.asList(1, 1));
        if (numRows <= 2) return result;

        for (int index = 2; index < numRows; index++) {
            List<Integer> intermediate = new ArrayList<>();
            intermediate.add(1);
            for (int i = 0; i < index - 1; i++) {
                List<Integer> previousList = result.get(index - 1);
                intermediate.add(previousList.get(i) + previousList.get(i + 1));
            }
            intermediate.add(1);
            result.add(intermediate);
        }
        return result;
    }

    public static void main(String[] args) {
        int input = 5;
        generate(input).forEach(System.out::println);
    }
}
