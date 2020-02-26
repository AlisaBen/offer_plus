package com.company.microsoft;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

/**
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 * 这个并没有优化
 */
class _33AllStringsArrayCut {
    public static void backtrack(String s, String tmp, boolean[] visited, Set<String> output) {
        if (tmp.length() == s.length()) output.add(tmp);
        for (int i = 0; i < s.length(); i++) {
            if (visited[i])continue;
            visited[i] = true;
            backtrack(s, tmp + String.valueOf(s.charAt(i)), visited, output);
            visited[i] = false;
        }
    }
    public static String[] permutations(String s){
        Set<String> result = new HashSet();
        backtrack(s,"", new boolean[s.length()], result);
        return result.toArray(new String[result.size()]);
    }
    public static void main(String[] args) {
        String s = "abc";
        String[] array = permutations(s);
        System.out.println(Arrays.toString(array));
    }
}