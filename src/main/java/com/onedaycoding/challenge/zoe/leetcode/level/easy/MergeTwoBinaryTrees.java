package com.onedaycoding.challenge.zoe.leetcode.level.easy;


// https://leetcode.com/problems/merge-two-binary-trees/
public class MergeTwoBinaryTrees {
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1, root2);
    }

    public static TreeNode merge(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 != null) {
            return root2;
        } else if (root1 != null && root2 == null) {
            return root1;
        } else if (root1 == null && root2 == null) {
            return null;
        }

        return new TreeNode(root1.val + root2.val, merge(root1.left, root2.left), merge(root1.right, root2.right));
    }

    static class TreeNode {
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
}
