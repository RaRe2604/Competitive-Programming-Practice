package com.leetcode.arrays;

public class ValidMountainArray {
    public static boolean validMountainArray(int[] A) {
        if (A == null || A.length <= 1) {
            return false;
        }
        int index = 0;

        //Checking the peak of the mountain
        while (index < A.length-1 && A[index] < A[index + 1]) {
            index++;
        }

        //Peak should not be at the beginning or ending
        if (index == 0 || index == A.length-1) {
            return false;
        } else {
            index++;
        }

        //Checking the strictly decreasing order of the mountain
        while (index < A.length) {
            if (A[index - 1] > A[index]) {
                index++;
            } else {
                return false;
            }
        }

        return index == A.length;
    }

    public static void main(String[] args) {
        int[] A = {2, 1};
        int[] B = {3, 5, 5};
        int[] C = {0, 3, 2, 1};
        int[] D = {0,1,2,3,4,5,6,7,8,9};
//        System.out.println(validMountainArray(A));
//        System.out.println(validMountainArray(B));
//        System.out.println(validMountainArray(C));
        System.out.println(validMountainArray(D));
    }
}
