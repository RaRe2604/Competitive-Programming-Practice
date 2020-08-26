package com.leetcode.arrays;

import java.util.stream.IntStream;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            int x = -1;
            while (++x < nums1.length)
                nums1[x] = nums2[x];
        }
        m--;
        n--;
        for (int i = m + n + 1; i > 0; i--)
            nums1[i] = nums1[m] < nums2[n] ? nums2[n--] : nums1[m--];

        IntStream.of(nums1).forEach(x -> System.out.print(" " + x));
    }

    public static void main(String[] args) {

//		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
//		int m = 3;
//		int[] nums2 = { 2, 5, 6 };
//		int n = 3;
//		merge(nums1, m, nums2, n);

        int[] nums1 = {2, 0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);

        System.out.println();

        int[] nums3 = {0};
        int m1 = 0;
        int[] nums4 = {1};
        int n1 = 1;
        merge(nums3, m1, nums4, n1);

    }

}
