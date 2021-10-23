package com.onedaycoding.challenge.donghyuk.leetcode.level.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationOfPhoneNumberTest {

    @Test
    void test() {
        final LetterCombinationOfPhoneNumber letterCombinationOfPhoneNumber = new LetterCombinationOfPhoneNumber();
        assertEquals(List.of("a", "b", "c"), letterCombinationOfPhoneNumber.letterCombinations("2"));
        assertEquals(List.of("ad","ae","af","bd","be","bf","cd","ce","cf"), letterCombinationOfPhoneNumber.letterCombinations("23"));
    }

}
