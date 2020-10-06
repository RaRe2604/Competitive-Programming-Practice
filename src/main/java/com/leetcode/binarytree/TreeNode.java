package com.leetcode.binarytree;

/**
 * User: Rahul Reddy
 * Date: 10/6/2020
 * Time: 4:43 PM
 */

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
