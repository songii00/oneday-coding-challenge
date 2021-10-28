package com.onedaycoding.challenge.donghyuk.leetcode.level.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TopKFrequentElementsTest {

    @Test
    void test() {
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        assertArrayEquals(new int[]{-1,2}, topKFrequentElements.topKFrequent(new int[]{4,1,-1,2,-1,2,3}, 2));
    }
}
