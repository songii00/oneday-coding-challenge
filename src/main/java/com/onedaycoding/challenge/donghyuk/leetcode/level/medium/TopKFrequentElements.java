package com.onedaycoding.challenge.donghyuk.leetcode.level.medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKFrequentElements {

/*
    Given an integer array nums and an integer k, return the k most frequent elements.
    You may return the answer in any order.

    Example 1:
        Input: nums = [1,1,1,2,2,3], k = 2
        Output: [1,2]

    Example 2:
        Input: nums = [1], k = 1
        Output: [1]
*/

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int num : nums) {
            if (numMap.containsKey(num)) {
                numMap.put(num, numMap.get(num) + 1);
                continue;
            }

            numMap.put(num, 1);
        }

        final List<Map.Entry<Integer, Integer>> collect = numMap.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue, (o1, o2) -> o2.compareTo(o1)))
                .collect(Collectors.toList());

        return collect.stream()
                .limit(k)
                .map(Map.Entry::getKey)
                .mapToInt(value -> value)
                .toArray();

    }
}
