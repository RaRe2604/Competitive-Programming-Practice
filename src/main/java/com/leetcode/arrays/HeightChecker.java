package com.leetcode.arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int movedCount = 0;
        int length = heights.length;
        int[] frequency = new int[101];
        for(int i=0;i<length;i++){
            frequency[heights[i]]++;
        }
        for (int i = 0, h = 0; i < length; i++) {
            while(frequency[h] == 0) h++;
            if (heights[i] != h) movedCount++;
            frequency[h]--;
        }
        return movedCount;
    }

    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
}
