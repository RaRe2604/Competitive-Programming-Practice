package com.leetcode.binarytree;

import java.util.LinkedList;
import java.util.List;

/**
 * User: Rahul Reddy
 * Date: 10/6/2020
 * Time: 4:39 PM
 */

public class InorderTraversal {

    private static void helper(TreeNode root, List<Integer> list) {
        if (root != null) {
            helper(root.left, list);
            list.add(root.val);
            helper(root.right, list);
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        helper(root, list);
        return list;
    }
}
