package com.onedaycoding.challenge.donghyuk.leetcode.level.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubsetsTest {

    @Test
    void test() {
        Subsets subsets = new Subsets();
        assertEquals(List.of(List.of(0), List.of()), subsets.subsets(new int[]{0}));
    }
}
