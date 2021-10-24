package com.onedaycoding.challenge.zoe.leetcode.level.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ValidParentheses {

    /**
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * An input string is valid if:
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     */

    public static boolean isValid(String s) {
        var stack = new Stack<String>();
        var startPattern = Arrays.asList("(", "{", "[");
        var splits = s.split("");

        for (String target : splits) {
            if (startPattern.contains(target)) {
                stack.push(target);
                continue;
            }

            if(stack.isEmpty()) {
                return false;
            }

            if (!isMatch(target, stack.pop())) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatch(String target, String before) {
        switch (target) {
            case ")" : return before.equals("(");
            case "}" : return before.equals("{");
            case "]" : return before.equals("[");
            default: return false;
        }
    }
}
