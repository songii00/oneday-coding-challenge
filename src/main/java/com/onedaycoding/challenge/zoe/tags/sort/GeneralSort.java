package com.onedaycoding.challenge.zoe.tags.sort;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GeneralSort {

    // input : 2, 19, 3, 23, 1, 12, 15
    // output : 1, 2, 3, 12, 15, 19, 23
    // O(n^2)
    public static int[] selectionSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        return array;
    }

    // O(n^2)
    public static int[] bubbleSort(int[] array) {
        int temp;
        for(int i=0; i<array.length-1; i++) {
            for(int j=0; j<array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    temp =  array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    // best : O(n)
    // worst / avg : O(n^2)
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int target = array[i];
            int j = i - 1;
            while (j >= 0 && target < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = target;
        }
        return array;
    }

    // best : O(n)
    // worst / avg : O(n^2)
    public static int[] mergeSort(int[] array) {
        return new int[]{};
    }
}
