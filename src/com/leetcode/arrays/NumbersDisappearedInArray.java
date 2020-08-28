package com.leetcode.arrays;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumbersDisappearedInArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int counter = 0; counter < nums.length; counter++) {
            int index = Math.abs(nums[counter]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        return IntStream.range(0, nums.length).parallel().filter(i -> nums[i] > 0).mapToObj(i -> i + 1).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
