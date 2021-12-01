package com.onedaycoding.challenge.zoe.leetcode.level.easy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.onedaycoding.challenge.zoe.leetcode.level.easy.BinaryTreeInorderTraversal.TreeNode;

class BinaryTreeInorderTraversalTest {
    @Test
    public void case1() {
        TreeNode leaf = new TreeNode(3);
        TreeNode middle = new TreeNode(2, leaf, null);
        TreeNode top = new TreeNode(1, null, middle);

        assertEquals(Arrays.asList(1, 3, 2), BinaryTreeInorderTraversal.inorderTraversal(top));
    }

    @Test
    public void case2() {
        TreeNode leaf = new TreeNode(3);
        TreeNode middle = new TreeNode(2, leaf, null);
        TreeNode top = new TreeNode(1, null, middle);

        assertEquals(Arrays.asList(1, 3, 2), BinaryTreeInorderTraversal.inorderTraversalByStack(top));
    }
}