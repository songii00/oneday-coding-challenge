package com.onedaycoding.challenge.zoe.leetcode.level.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SearchInsertPositionTest {

    @Test
    public void case1() {
        assertEquals(1, SearchInsertPosition.searchInsert(new int[] {1,3,5,6}, 2));
    }

    @Test
    public void case2() {
        assertEquals(2, SearchInsertPosition.searchInsert(new int[] {1,3,5,6}, 5));
    }
}