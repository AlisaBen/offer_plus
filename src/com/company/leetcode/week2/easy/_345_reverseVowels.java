package com.company.leetcode.week2.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class _345_reverseVowels {
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    public static String reverseVowels(String s) {
        int i = 0,j = s.length() - 1;
        StringBuilder result = new StringBuilder(s);
        while (i < j){
            if(isVowel(s.charAt(i))){
                if(isVowel(s.charAt(j))){
                    result.setCharAt(i,s.charAt(j));
                    result.setCharAt(j,s.charAt(i));
                    i++;j--;
                }else{
                    j--;
                }
            }else{
                i++;
                if(!isVowel(s.charAt(j))){
                    j--;
                }
            }
        }

        return result.toString();
    }
    public static void main(String[] args){
        String result = reverseVowels("leetcode");
        System.out.println(result);
    }
}
