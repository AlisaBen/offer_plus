package com.company.leetcode.week2.easy;

import java.util.Arrays;

public class _344_reverseString {
    public static void reverseString(char[] s) {
        for(int i = 0,j = s.length - 1;i < j;i++,j--){
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
        System.out.println(Arrays.toString(s));

    }
    public static void main(String [] args){
        char[] result = {'t','g','f','y','p'};
//        result[1] = 'h';
//        System.out.println(Arrays.toString(result));
        reverseString(result);
    }
}
