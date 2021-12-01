package com.onedaycoding.challenge.zoe.leetcode.level.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClimbingStairsTest {
    @Test
    public void case1() {
        assertEquals(2, ClimbingStairs.climbStairsRecursive(2));
    }

    @Test
    public void case2() {
        assertEquals(3, ClimbingStairs.climbStairsRecursive(3));
    }

    @Test
    public void case3() {
        assertEquals(5, ClimbingStairs.climbStairsRecursive(4));
    }

    @Test
    public void case4() {
        assertEquals(8, ClimbingStairs.climbStairsRecursive(5));
    }

    @Test
    public void case5() {
        assertEquals(13, ClimbingStairs.climbStairsRecursive(6));
    }

    @Test
    public void case6() {
        assertEquals(21, ClimbingStairs.climbStairsRecursive(7));
    }
}