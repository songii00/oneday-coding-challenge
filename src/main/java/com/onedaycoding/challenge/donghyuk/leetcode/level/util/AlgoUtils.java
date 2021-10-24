package com.onedaycoding.challenge.donghyuk.leetcode.level.util;

import java.util.*;
import java.util.stream.Collectors;

public class AlgoUtils {

    public String[] toArray(String str) {
        return str.split("");
    }

    public List<String> toList(String str) {
        return Arrays.stream(str.split("")).collect(Collectors.toList());
    }

    public char[] toCharArray(String str) {
        return str.toCharArray();
    }

    public List<char[]> toCharList(String str) {
        final char[] chars = str.toCharArray();
        return Arrays.stream(new char[][]{chars}).collect(Collectors.toList());
    }

    /**
     * description
     * ASCII CODE (65 - 90) 대문자 (97 - 122) 소문자
     */
    public int toAsciiCode(char c) {
        return c;
    }

    public char toValue(int code) {
        return (char) code;
    }

    public String toValueString(int code) {
        return String.valueOf((char) code);
    }

    /**
     * description
     * 최대공약수 구하기 ( 유클리드 호제법 )
     */
    public int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    /**
     * description
     * 소수 체크하기 ( n * n 까지만 )
     */
    public boolean prime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * description
     * String -> Stack
     */
    public Stack<String> toStack(String str) {
        Stack<String> stringStack = new Stack<>();
        String[] chars = str.split("");
        stringStack.addAll(Arrays.asList(chars));
        return stringStack;
    }

    /**
     * description
     * String -> Stack (reverse)
     */
    public Stack<String> toReverseStack(String str) {
        Stack<String> stringStack = new Stack<>();
        String[] chars = str.split("");
        for (int i = chars.length - 1; i >= 0; i--) {
            stringStack.add(chars[i]);
        }
        return stringStack;
    }

    /**
     * description
     * String Array -> String
     */
    public String toString(String[] strings) {
        return String.join("", strings);
    }

    /**
     * description
     * String List -> String Array
     */
    public String[] toArray(List<String> strings) {
        return strings.stream().toArray(String[]::new);
    }

    /**
     * description
     * BFS
     */
    public String bfs(int start, int[][] graph, boolean[] visited) {
        // 탐색 순서를 출력하기 위한 용도
        StringBuilder sb = new StringBuilder();
        // BFS에 사용할 큐를 생성해줍니다.
        Queue<Integer> q = new LinkedList<Integer>();
        // 큐에 BFS를 시작 할 노드 번호를 넣어줍니다.
        q.offer(start);
        // 시작노드 방문처리
        visited[start] = true;
        // 큐가 빌 때까지 반복
        while (!q.isEmpty()) {
            int nodeIndex = q.poll();
            sb.append(nodeIndex + " -> ");
            //큐에서 꺼낸 노드와 연결된 노드들 체크
            for (int i = 0; i < graph[nodeIndex].length; i++) {
                int temp = graph[nodeIndex][i];
                // 방문하지 않았으면 방문처리 후 큐에 넣기
                if (!visited[temp]) {
                    visited[temp] = true;
                    q.offer(temp);
                }
            }
        }
        // 탐색순서 리턴
        return sb.toString();
    }

    /**
     * description
     * perm
     */
    public void perm(String[] strings, String[] out, int index, boolean[] visited) {
        if(index == 3) {
            //끝
            System.out.println("at = " + String.join("", out));
            return;
        }

        for(int i = 0 ; i < strings.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                out[index] = strings[i];
                perm(strings, out,index+1, visited);
                visited[i] = false;
            }
        }
    }

}
