package com.onedaycoding.challenge.zoe.leetcode.level.easy;

// https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];

        if (nums.length == 1) {
            return maxSum;
        }

        var tempArray = new int[nums.length];

        tempArray[0] = nums[0];
        maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            tempArray[i] = nums[i] + (Math.max(tempArray[i - 1], 0));
            maxSum = Math.max(maxSum, tempArray[i]);
        }
        return maxSum;
    }
}
