package com.onedaycoding.challenge.zoe.leetcode.level.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/
public class BinaryTreeInorderTraversal {

    // binary tree
    // VLR(preorder) : 전위 순회
    // LVR(inorder) : 중위 순회
    // LRV(postorder) : 후위 순회

    private static List<Integer> result = new ArrayList<>();

    public static List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) {
            return result;
        }
        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);
        return result;
    }

    public static List<Integer> inorderTraversalByStack(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while(current != null || !stack.isEmpty()) {
            while(current != null) {
                stack.add(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }
        return result;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() { }
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

