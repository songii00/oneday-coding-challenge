package com.onedaycoding.challenge.donghyuk.leetcode.level.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Given an array nums of distinct integers,
    return all the possible permutations.
    You can return the answer in any order.

    Example 1:
        Input: nums = [1,2,3]
        Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

    Example 2:
        Input: nums = [0,1]
        Output: [[0,1],[1,0]]

    Example 3:
        Input: nums = [1]
        Output: [[1]]
*/


public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        List<List<Integer>> answer = new ArrayList<>();

        perm(nums, new int[nums.length], visited, 0, answer);

        return answer;
    }

    public void perm(final int[] nums, final int[] out, final boolean[] visited, final int index, final List<List<Integer>> answer) {
        if (index == nums.length) {
            answer.add(Arrays.stream(out).boxed().collect(Collectors.toList()));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                out[index] = nums[i];
                perm(nums, out, visited, index + 1, answer);
                visited[i] = false;
            }
        }
    }
}
