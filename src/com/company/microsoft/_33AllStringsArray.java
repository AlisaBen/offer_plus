package com.company.microsoft;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

/**
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 */
class _33AllStringsArray {
    public static void swap(char[] array, int i, int j) {
        char c = array[i];
        array[i] = array[j];
        array[j] = c;
    }
    public static void backtrack(char[] s, Set<String> output, int first) {
        if (first == s.length - 1) output.add(String.valueOf(s));
        for (int i = first; i < s.length; i++) {
            swap(s, i, first);
            backtrack(s, output, first + 1);
            swap(s, i, first);
        }
    }
    public static String[] permutations(String s){
        Set<String> result = new HashSet();
        backtrack(s.toCharArray(), result, 0);
        return result.toArray(new String[result.size()]);
    }
    public static void main(String[] args) {
        String s = "abc";
        String[] array = permutations(s);
        System.out.println(Arrays.toString(array));
    }
}