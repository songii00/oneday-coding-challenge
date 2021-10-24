package com.onedaycoding.challenge.donghyuk.leetcode.level.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartitionLabelsTest {

    @Test
    void test() {
        PartitionLabels partitionLabels = new PartitionLabels();
        assertEquals(List.of(9, 7, 8), partitionLabels.partitionLabels("ababcbacadefegdehijhklij"));
        assertEquals(List.of(1, 9), partitionLabels.partitionLabels("caedbdedda"));
        assertEquals(List.of(9, 1), partitionLabels.partitionLabels("eaaaabaaec"));
        assertEquals(List.of(3, 2, 1, 2, 3, 1, 1, 1, 1, 3, 2), partitionLabels.partitionLabels("jajnnxkkemesdwgiyiqq"));
    }
}
