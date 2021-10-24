package com.onedaycoding.challenge.donghyuk.leetcode.level.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {


    @Test
    void test() {
//        assertEquals(49, new ContainerWithMostWater().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        assertEquals(2, new ContainerWithMostWater().maxArea(new int[]{1, 2, 1}));
        assertEquals(49, new ContainerWithMostWater().maxArea(new int[]{1,8,6,2,5,4,8,25,7}));
    }

}
