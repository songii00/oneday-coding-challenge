package com.onedaycoding.challenge.zoe.leetcode.level.easy;

// https://leetcode.com/problems/search-insert-position/
// https://blog.chulgil.me/algorithm/
public class SearchInsertPosition {

    /**
     * Given a sorted array of distinct integers and a target value, return the index if the target is found.
     * If not, return the index where it would be if it were inserted in order.
     * You must write an algorithm with O(log n) runtime complexity.
     */

    /**
     * example 1 Input: nums = [1,3,5,6], target = 5 Output: 2
     */
    public static int searchInsert(int[] nums, int target) {
        if (nums[0] > target) {
            return 0;
        }

        if (nums[nums.length - 1] < target) {
            return nums.length;
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= target) {
                return i;
            }
        }

        throw new IllegalArgumentException();
    }
}
