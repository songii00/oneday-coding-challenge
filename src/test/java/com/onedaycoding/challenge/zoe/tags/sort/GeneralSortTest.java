package com.onedaycoding.challenge.zoe.tags.sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneralSortTest {

    @Test
    public void 선택정렬(){
        int[] array = { 2, 19, 3, 23, 1, 12, 15 };
        int[] sortedArray = { 1, 2, 3, 12, 15, 19, 23 };

        assertArrayEquals(sortedArray, GeneralSort.selectionSort(array));
    }

    @Test
    public void 버블정렬() {
        int[] array = { 2, 19, 3, 23, 1, 12, 15 };
        // 1
        int[] sortedArray = { 1, 2, 3, 12, 15, 19, 23 };
        assertArrayEquals(sortedArray, GeneralSort.bubbleSort(array));
    }

    @Test
    public void 삽입정렬() {
        int[] array = { 2, 19, 3, 23, 1, 12, 15 };
        // 1
        int[] sortedArray = { 1, 2, 3, 12, 15, 19, 23 };
        assertArrayEquals(sortedArray, GeneralSort.insertionSort(array));
    }
}