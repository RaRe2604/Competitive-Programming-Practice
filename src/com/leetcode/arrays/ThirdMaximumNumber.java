package com.leetcode.arrays;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        int firstMaximum = Integer.MIN_VALUE;
        int secondMaximum = Integer.MIN_VALUE;
        int thirdMaximum = Integer.MIN_VALUE;
        boolean isMinimumContained = false;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == Integer.MIN_VALUE)
                isMinimumContained = true;
            if (nums[index] > firstMaximum) {
                thirdMaximum = secondMaximum;
                secondMaximum = firstMaximum;
                firstMaximum = nums[index];
            } else if (nums[index] < firstMaximum && nums[index] > secondMaximum) {
                thirdMaximum = secondMaximum;
                secondMaximum = nums[index];
            } else if (nums[index] < secondMaximum)
                thirdMaximum = Math.max(thirdMaximum, nums[index]);
        }
//        System.out.println(firstMaximum + "-> " + secondMaximum + "-> " + thirdMaximum);
        return (thirdMaximum == Integer.MIN_VALUE) ? (isMinimumContained && secondMaximum == Integer.MIN_VALUE? thirdMaximum : firstMaximum) : thirdMaximum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        int[] nums1 = {1, 2};
        int[] nums2 = {2, 2, 3, 1};
        int[] nums3 = {5, 2, 2};
        int[] nums4 = {1, 2, 2, 5, 3, 5};
        int[] nums5 = {1,2,-2147483648};
        int[] nums6 = {-2147483648,1,1};
        System.out.println(thirdMax(nums));
        System.out.println(thirdMax(nums1));
        System.out.println(thirdMax(nums2));
        System.out.println(thirdMax(nums3));
        System.out.println(thirdMax(nums4));
        System.out.println(thirdMax(nums5));
        System.out.println(thirdMax(nums6));
    }
}
