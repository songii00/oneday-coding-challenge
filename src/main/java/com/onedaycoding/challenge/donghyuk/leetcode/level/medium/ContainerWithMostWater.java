package com.onedaycoding.challenge.donghyuk.leetcode.level.medium;

public class ContainerWithMostWater {

//    Given n non-negative integers a1, a2, ..., an ,
//    where each represents a point at coordinate (i, ai).
//    n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0).
//    Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
//
//    Notice that you may not slant the container.


    //Tow Pointer 문제.
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (right - left > 0) {
            int width = right - left;
            int heights = Math.min(height[left], height[right]);
            int area = width * heights;

            if (area > max) {
                max = area;
            }

            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }

        return max;
    }

}
