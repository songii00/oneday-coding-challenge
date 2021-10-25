package com.onedaycoding.challenge.donghyuk.leetcode.level.medium;

/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

    Example 1:
        Input: n = 3
        Output: ["((()))","(()())","(())()","()(())","()()()"]

    Example 2:
        Input: n = 1
        Output: ["()"]

*/


import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        int right = n;
        int left = n;
        List<String> answer = new ArrayList<>();

        iter(right - 1, left, 1, n * 2, answer, "(");

        return answer;
    }

    public void iter(int right, int left, int index, int endIndex, List<String> answer, String out) {
        if (index == endIndex) {
            answer.add(out);
            return;
        }

        //연다.
        if (right > 0) {
            iter(right - 1, left, index + 1, endIndex, answer, out + "(");
        }

        //닫는다.
        if (left > right && left > 0) {
            iter(right, left - 1, index + 1, endIndex, answer, out + ")");
        }
    }
}
