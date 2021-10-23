package com.onedaycoding.challenge.donghyuk.leetcode.level.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhoneNumber {


    /*
    Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
    Return the answer in any order.

    A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

    Example 1:
        Input: digits = "23"
        Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

    Example 2:
        Input: digits = ""
        Output: []

    Example 3:
        Input: digits = "2"
        Output: ["a","b","c"]

    */

    //DFS 문제
    public List<String> letterCombinations(String digits) {
        Map<String, List<String>> phoneButtons = new HashMap<>();
        init(phoneButtons);
        List<String> answer = new ArrayList<>();

        if (digits.equals("")) {
            return new ArrayList<>();
        }

        recursive(phoneButtons, digits.split(""), answer, 0, "");

        return answer;
    }

    private void recursive(final Map<String, List<String>> phoneButtons, final String[] split, final List<String> answer, int index, String selected) {
        if (index == split.length) {
            answer.add(selected);
            return;
        }

        String token = split[index];
        final List<String> chars = phoneButtons.get(token);

        for (String button : chars) {
            recursive(phoneButtons, split, answer, index + 1, selected + button);
        }

    }


    public void init(Map<String, List<String>> phoneButtons) {
        phoneButtons.put("2", List.of("a", "b", "c"));
        phoneButtons.put("3", List.of("d", "e", "f"));
        phoneButtons.put("4", List.of("g", "h", "i"));
        phoneButtons.put("5", List.of("j", "k", "l"));
        phoneButtons.put("6", List.of("m", "n", "o"));
        phoneButtons.put("7", List.of("p", "q", "r", "s"));
        phoneButtons.put("8", List.of("t", "u", "v"));
        phoneButtons.put("9", List.of("w", "x", "y", "z"));
    }
}
