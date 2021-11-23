package com.onedaycoding.challenge.zoe.leetcode.level.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumSubarrayTest {
    @Test
    public void case1() {
        assertEquals(6, MaximumSubarray.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }

    @Test
    public void case2() {
        assertEquals(1, MaximumSubarray.maxSubArray(new int[] {1}));
    }

    @Test
    public void case3() {
        assertEquals(23, MaximumSubarray.maxSubArray(new int[] {5,4,-1,7,8}));
    }

    @Test
    public void case4() {
        assertEquals(1, MaximumSubarray.maxSubArray(new int[] {-2, 1}));
    }

    @Test
    public void case5() {
        assertEquals(-1, MaximumSubarray.maxSubArray(new int[] {-2, -3, -1}));
    }
}