package com.leetcode.queuestack;

/**
 * User: Rahul Reddy
 * Date: 9/14/2020
 * Time: 4:47 PM
 */

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (newColor != image[sr][sc])
            dfs(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int oldColor, int newColor) {
        if (!((sr < 0 || sr >= image.length) || (sc < 0 || sc >= image[0].length))) {
            if (image[sr][sc] == oldColor) {
                image[sr][sc] = newColor;
                dfs(image, sr - 1, sc, oldColor, newColor);
                dfs(image, sr, sc - 1, oldColor, newColor);
                dfs(image, sr + 1, sc, oldColor, newColor);
                dfs(image, sr, sc + 1, oldColor, newColor);
            }
        }
    }
}
