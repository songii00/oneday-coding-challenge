package com.onedaycoding.challenge.donghyuk.leetcode.level.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {

    @Test
    void test() {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        assertEquals(List.of("((()))","(()())","(())()","()(())","()()()"), generateParentheses.generateParenthesis(3));
    }

}
