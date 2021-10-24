package com.onedaycoding.challenge.donghyuk.leetcode.level.medium;


/*

Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:
    Input: nums = [1,2,3]
    Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Example 2:
    Input: nums = [0]
    Output: [[],[0]]
*/

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        int index = 0;
        iter(nums, answer, index, new ArrayList<Integer>());

        return answer;
    }

    public void iter(final int[] nums, final List<List<Integer>> answer, final int index, final List<Integer> selected) {
        if (index == nums.length) {
            answer.add(selected);
            return;
        }

        List<Integer> newSelected = new ArrayList<>();
        newSelected.addAll(selected);
        newSelected.add(nums[index]);
        iter(nums, answer, index + 1, newSelected);
        iter(nums, answer, index + 1, selected);
    }
}
