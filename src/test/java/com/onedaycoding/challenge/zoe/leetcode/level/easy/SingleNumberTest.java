package com.onedaycoding.challenge.zoe.leetcode.level.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SingleNumberTest {
    @Test
    public void case1() {
        assertEquals(4, SingleNumber.singleNumber(new int[]{4,1,2,1,2}));
    }

    @Test
    public void case2() {
        assertEquals(1, SingleNumber.singleNumber(new int[]{2,2,1}));
    }

    @Test
    public void case3() {
        assertEquals(1, SingleNumber.singleNumberByXor(new int[]{2,2,1}));
    }
}