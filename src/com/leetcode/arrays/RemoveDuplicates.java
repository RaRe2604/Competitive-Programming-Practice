package com.leetcode.arrays;

public class RemoveDuplicates {
    public static int removeDuplicatesInSortedArray(int[] nums) {
        if (nums.length == 0)
            return 0;
        int headPointer = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j - 1] != nums[j]) {
                nums[headPointer] = nums[j];
                headPointer++;
            }
        }
//       System.out.print("---> ");
//		IntStream.of(nums).limit(headPointer).forEach(x -> System.out.print(x + " "));
//		System.out.println();
        return headPointer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        int[] arr1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] arr2 = {0};
        int[] arr3 = {0, 0, 0};
        int[] arr4 = {};

        System.out.println(removeDuplicatesInSortedArray(arr));
        System.out.println(removeDuplicatesInSortedArray(arr1));
        System.out.println(removeDuplicatesInSortedArray(arr2));
        System.out.println(removeDuplicatesInSortedArray(arr3));
        System.out.println(removeDuplicatesInSortedArray(arr4));
    }
}
