package com.leetcode.arrays;

import java.util.Arrays;

public class ReplaceElementsWithGreaterElementOnRightSide {
    public static int[] replaceElements(int[] arr) {

    /*     for (int i = 0; i < arr.length - 1; i++) {
             int maxValue = 0;
             for (int j = i + 1; j < arr.length; j++) {
                 maxValue = Math.max(maxValue, arr[j]);
             }
             arr[i] = maxValue;
         }
         arr[arr.length - 1] = -1;
         return arr;
     */
        //Optimal solution
        int maxValue = -1;
        for (int index = arr.length - 1; index >= 0; index--) {
            int temp = arr[index];
            arr[index] = maxValue;
            maxValue = Math.max(maxValue, temp);
        }
        return arr;
    }

    public static void main(String[] args) {
        /*
         * Constraints
         * 1 <= arr.length <= 10^4
         * 1 <= arr[i] <= 10^5
         * */
        int[] array = {17, 18, 5, 4, 6, 1};
        Arrays.stream(replaceElements(array)).forEach(number -> System.out.print(number + " "));
    }
}
