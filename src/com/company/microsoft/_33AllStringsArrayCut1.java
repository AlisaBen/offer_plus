package com.company.microsoft;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * 回溯法加剪枝
 * 该算法和之间的不同在于记录used的列表是局部列表,每次for循环前初始化，以表示在当前的状态下，遍历的字母是否被使用过，当前的状态是对不同的index情况下有不同的字母序列，针对这个序列记录使用的情况
 */
class _33AllStringsArrayCut1 {
    public static String[] permutation(String s) {
        ArrayList<String> result = new ArrayList<String>();
        backtrack(s.toCharArray(), result, 0, s.length());
        String[] res = new String[result.size()];
        return result.toArray(res);
    }

    private static void backtrack(char[] chars, List<String> result, int index, int len){
        if(index == len - 1){
            String s = new String(chars);
            System.out.println("backtrack: s: " + s);
            result.add(s);
            return;
        }
        boolean[] used = new boolean[256];
        for(int i = index; i < chars.length; i++){
            System.out.println("backtrack:" + " index: " + index + " i: " + i + " chars:" + Arrays.toString(chars));
            if(used[chars[i]]) {
                System.out.println("backtrack: used:" + chars[i] + " index: " + index + " i: " + i + " chars:" + Arrays.toString(chars));
                continue;
            }
            used[chars[i]] = true;
            swap(chars, i, index);
            System.out.println("backtrack:" + " index: " + index + " i: " + i + " 交换数据后的列表" +  " chars:" + Arrays.toString(chars));
            backtrack(chars, result, index + 1, len);
            swap(chars, i, index);
            System.out.println("backtrack:" + " index: " + index + " i: " + i + " 交换回数据的列表" +  " chars:" + Arrays.toString(chars));
        }
    }

    private static void swap(char[] chars, int i, int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    public static void main(String[] args) {
        String s = "aba";
        String[] array = permutation(s);
        System.out.println(Arrays.toString(array));
    }
}