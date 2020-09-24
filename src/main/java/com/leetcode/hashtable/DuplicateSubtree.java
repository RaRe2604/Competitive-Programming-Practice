package com.leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Rahul Reddy
 * Date: 9/24/2020
 * Time: 3:54 PM
 */


public class DuplicateSubtree {
    Map<String, Integer> map = new HashMap<>();
    List<TreeNode> result = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return result;
    }

    public String dfs(TreeNode root) {
        if (root == null) {
            return "#";
        }
        String left = dfs(root.left);
        String right = dfs(root.right);
        String subTree = root.val + ":" + left + ":" + right;
        if (map.containsKey(subTree) && map.get(subTree) == 1) {
            result.add(root);
        }
        map.put(subTree, map.getOrDefault(subTree, 0) + 1);
        return subTree;
    }
}

class TreeNode {
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
