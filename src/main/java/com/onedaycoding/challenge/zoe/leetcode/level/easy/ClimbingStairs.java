package com.onedaycoding.challenge.zoe.leetcode.level.easy;

// https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        int twoStepBeforeNumber = 1;
        int oneStepBeforeNumber = 2;
        int result = 0;

        for (int i = 2; i < n; i++) {
            result = oneStepBeforeNumber + twoStepBeforeNumber;
            twoStepBeforeNumber = oneStepBeforeNumber;
            oneStepBeforeNumber = result;
        }
        return result;
    }

    public static int climbStairsRecursive(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        return climbStairsRecursive(n - 2) + climbStairsRecursive(n - 1);
    }
}
