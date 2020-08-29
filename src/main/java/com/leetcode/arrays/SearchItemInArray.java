package com.leetcode.arrays;

public class SearchItemInArray {
    public static boolean checkIfExist(int[] arr) {

        if (arr == null) {
            return false;
        }
        for (int index = 0; index < arr.length - 1; index++) {
            for (int i = index + 1; i < arr.length; i++) {
                if (arr[index] == (2 * arr[i]))
                    return true;
                if (arr[i] % 2 == 0 && (arr[index] == (arr[i] / 2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 2, 5, 3};
        int[] arr2 = {7, 1, 14, 11};
        int[] arr3 = {3, 1, 7, 11};
        System.out.println(checkIfExist(arr1));
        System.out.println(checkIfExist(arr2));
        System.out.println(checkIfExist(arr3));
    }
}

