package com.onedaycoding.challenge.donghyuk.leetcode.level.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {

    @Test
    void test() {
        Permutations permutations = new Permutations();
        assertEquals(List.of(List.of(0,1), List.of(1,0)), permutations.permute(new int[]{0,1}));
    }

}
