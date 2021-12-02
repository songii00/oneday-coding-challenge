package com.onedaycoding.challenge.zoe.leetcode.level.easy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.onedaycoding.challenge.zoe.leetcode.level.easy.SymmetricTree.TreeNode;


class SymmetricTreeTest {
    @Test
    public void case1() {
        TreeNode leafLeft = new TreeNode(3);
        TreeNode leafRight = new TreeNode(4);
        TreeNode middleLeft = new TreeNode(2, leafLeft, leafRight);
        TreeNode middleRight = new TreeNode(2, leafRight, leafLeft);
        TreeNode top = new TreeNode(1, middleLeft, middleRight);

        assertTrue(SymmetricTree.isSymmetric(top));
    }

}