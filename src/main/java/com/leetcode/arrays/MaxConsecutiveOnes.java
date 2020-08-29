package com.leetcode.arrays;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int tempCounter = 0;
        for (int num : nums) {
            if (num == 1) {
                tempCounter++;
            } else {
                if (tempCounter > result)
                    result = tempCounter;
                tempCounter = 0;
            }
        }
        return (tempCounter > result) ? tempCounter : result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
