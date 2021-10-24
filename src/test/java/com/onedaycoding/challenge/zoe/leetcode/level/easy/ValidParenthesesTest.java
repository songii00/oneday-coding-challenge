package com.onedaycoding.challenge.zoe.leetcode.level.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    @Test
    public void case1() {
        assertTrue(ValidParentheses.isValid("()"));
    }

    @Test
    public void case2() {
        assertTrue(ValidParentheses.isValid("()[]{}"));
    }

    @Test
    public void case3() {
        assertFalse(ValidParentheses.isValid("(]"));
    }

    @Test
    public void case4() {
        assertTrue(ValidParentheses.isValid("{[]}"));
    }

    @Test
    public void case5() {
        assertFalse(ValidParentheses.isValid("([)]"));
    }
}