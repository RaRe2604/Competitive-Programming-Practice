package com.leetcode.binarytree;

/**
 * User: Rahul Reddy
 * Date: 10/7/2020
 * Time: 4:04 PM
 */

public class MaximumDepth {
    int result = 0;

    public int maxDepth(TreeNode root) {
        helper(root, 0);
        return result;
    }

    private void helper(TreeNode root, int depth) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                result = Math.max(result, depth);
            }
            helper(root.left, depth + 1);
            helper(root.right, depth + 1);
        }
    }
}
