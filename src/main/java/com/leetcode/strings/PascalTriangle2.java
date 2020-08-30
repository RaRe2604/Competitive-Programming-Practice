package com.leetcode.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * User: Rahul Reddy
 * Date: 8/30/2020
 * Time: 11:08 AM
 */

public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = Collections.singletonList(1);
        if (rowIndex > 0) {
            List<Integer> previousResult = new ArrayList<>();
            int i = 0;
            while (++i <= rowIndex) {
                result = new ArrayList<>();
                result.add(1);
                for (int index = 1; index < i; index++) {
                    result.add(previousResult.get(index - 1) + previousResult.get(index));
                }
                result.add(1);
                previousResult = result;
            }
        }
        return result;
    }
}
