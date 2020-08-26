package com.leetcode.arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int headPointer = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[headPointer] = nums[j];
                headPointer++;
            }
        }
//		System.out.print("---> ");
//		IntStream.of(nums).limit(headPointer).forEach(x -> System.out.print(x + " "));
//		System.out.println();
        return headPointer;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int[] arr1 = {3, 2, 3, 3};
        int[] arr2 = {3, 2, 2, 3};
        int[] arr3 = {};
        int[] arr4 = {2};
        int[] arr5 = {2};
        System.out.println(removeElement(arr, 2));
        System.out.println(removeElement(arr1, 2));
        System.out.println(removeElement(arr2, 3));
        System.out.println(removeElement(arr3, 0));
        System.out.println(removeElement(arr4, 3));
        System.out.println(removeElement(arr5, 2));
    }
}
