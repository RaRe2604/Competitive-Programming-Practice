package com.leetcode.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * User: Rahul Reddy
 * Date: 10/6/2020
 * Time: 4:47 PM
 */

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> levelResult = new ArrayList<>();
            while (size-- > 0) {
                TreeNode treeNode = queue.poll();
                if (treeNode != null) {
                    levelResult.add(treeNode.val);
                    if (treeNode.left != null)
                        queue.offer(treeNode.left);
                    if (treeNode.right != null)
                        queue.offer(treeNode.right);
                }
            }
            result.add(levelResult);
        }
        return result;
    }
}
