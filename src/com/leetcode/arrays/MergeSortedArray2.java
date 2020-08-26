package com.leetcode.arrays;

import java.util.stream.IntStream;

public class MergeSortedArray2 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int firstPointer = m - 1;
        int secondPointer = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (secondPointer < 0) {
                break;
            }
            if (firstPointer >= 0 && nums1[firstPointer] > nums2[secondPointer]) {
                nums1[i] = nums1[firstPointer--];
            } else {
                nums1[i] = nums2[secondPointer--];
            }
        }
        IntStream.of(nums1).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums_1 = {1, 2, 3, 0, 0, 0};
        int m_1 = 3;
        int[] nums_2 = {2, 5, 6};
        int n_1 = 3;
        merge(nums_1, m_1, nums_2, n_1);

        int[] nums1 = {2, 0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);

        int[] nums3 = {1};
        int m1 = 1;
        int[] nums4 = {};
        int n1 = 0;
        merge(nums3, m1, nums4, n1);

        int[] nums5 = {4, 5, 6, 0, 0, 0};
        int m2 = 3;
        int[] nums6 = {1, 2, 3};
        int n2 = 3;
        merge(nums5, m2, nums6, n2);

        int[] nums11 = {4, 0, 0, 0, 0, 0};
        m = 1;
        int[] nums22 = {1, 2, 3, 5, 6};
        n = 5;
        merge(nums11, m, nums22, n);
    }
}