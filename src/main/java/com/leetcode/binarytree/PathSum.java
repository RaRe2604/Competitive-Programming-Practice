package com.leetcode.binarytree;

/**
 * User: Rahul Reddy
 * Date: 10/8/2020
 * Time: 1:21 PM
 */

public class PathSum {

/*
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
            return false;
        sum-=root.val;
        if((root.left==null)&&(root.right==null))
            return(sum==0);
        return hasPathSum(root.left,sum)||hasPathSum(root.right,sum);
    }
*/

    private boolean result = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root != null)
            helper(root, sum);
        return result;
    }

    private void helper(TreeNode root, int sum) {
        if (root.left == null && root.right == null) {
            if (sum - root.val == 0)
                result = true;
        }
        if (root.left != null)
            helper(root.left, sum - root.val);
        if (root.right != null)
            helper(root.right, sum - root.val);
    }
}
