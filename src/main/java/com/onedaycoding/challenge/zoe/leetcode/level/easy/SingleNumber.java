package com.onedaycoding.challenge.zoe.leetcode.level.easy;

import java.util.Arrays;

// https://leetcode.com/problems/single-number/
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                if (i == 1) {
                    return nums[0];
                }
                if (i + 1 >= nums.length) {
                    return nums[i];
                }
                if (nums[i] != nums[i + 1]) {
                    return nums[i];
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public static int singleNumberByXor(int[] nums) {
        // 시간 복잡도 O(n), 공간복잡도 O(1)
        // a와 a의 베타적 논리합은 0
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }

}
