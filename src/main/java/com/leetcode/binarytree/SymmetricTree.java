package com.leetcode.binarytree;

/**
 * User: Rahul Reddy
 * Date: 10/7/2020
 * Time: 4:30 PM
 */

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    private boolean isMirror(TreeNode node1, TreeNode node2) {
        if (node1 == null || node2 == null) {
            return node1 == node2;
        }

        if (node1.val != node2.val)
            return false;

        return isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }
}
