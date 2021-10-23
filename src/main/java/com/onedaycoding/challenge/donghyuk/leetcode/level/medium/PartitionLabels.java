package com.onedaycoding.challenge.donghyuk.leetcode.level.medium;

import java.util.*;

public class PartitionLabels {

/*
    You are given a string s.
    We want to partition the string into as many parts as possible so that each letter appears in at most one part.

    Return a list of integers representing the size of these parts.

    Example 1:
        Input: s = "ababcbacadefegdehijhklij"
        Output: [9,7,8]
        Explanation:
        The partition is "ababcbaca", "defegde", "hijhklij".
        This is a partition so that each letter appears in at most one part.
        A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.

    Example 2:
        Input: s = "eccbbbbdec"
        Output: [10]
*/

    public List<Integer> partitionLabels(String s) {
        Map<Character, LabelPosition> labels = new LinkedHashMap<>();
        char[] tokens = s.toCharArray();
        for (int i = 0; i < tokens.length; i++) {
            if (labels.containsKey(tokens[i])) {
                labels.get(tokens[i]).setEndAt(i);
            } else {
                labels.put(tokens[i], new LabelPosition(i, i));
            }
        }

        final Iterator<Map.Entry<Character, LabelPosition>> iterator = labels.entrySet().iterator();

        int start = 0;
        int end = -1;
        List<Integer> answer = new ArrayList<>();

        while (iterator.hasNext()) {
            final Map.Entry<Character, LabelPosition> next = iterator.next();
            final int startAt = next.getValue().startAt;
            final int endAt = next.getValue().endAt;

            if (end == -1) {
                start = startAt;
                end = endAt;
                if (endAt == s.length() - 1) {
                    answer.add(end - start + 1);
                    break;
                }
            } else if (startAt > start && endAt < end) {
                if (!iterator.hasNext()) {
                    answer.add(end - start + 1);
                }
            } else if (startAt > end) {
                answer.add(end - start + 1);
                start = startAt;
                end = endAt;
                if (!iterator.hasNext()) {
                    answer.add(end - start + 1);
                }
            } else if (startAt > start && endAt > end) {
                end = endAt;
                if (!iterator.hasNext()) {
                    answer.add(endAt - start + 1);
                }
            }
        }

        return answer;
    }

    class LabelPosition {
        private int startAt;
        private int endAt;

        public LabelPosition(final int startAt, final int endAt) {
            this.startAt = startAt;
            this.endAt = endAt;
        }

        public void setEndAt(final int endAt) {
            this.endAt = endAt;
        }
    }
}
