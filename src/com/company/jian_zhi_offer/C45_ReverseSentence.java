package com.company.jian_zhi_offer;

import java.lang.ProcessBuilder.Redirect;

public class C45_ReverseSentence {
    public static String reverse(String str) {
        if (str == null || str.length() <= 1) return str;
        char[] s = str.toCharArray();
        int len = s.length;
        int i = 0;
        int j = len - 1;
        while (i < j) {
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
            i++;j--;
        }
        return String.valueOf(s);
    }
    public static String ReverseSentence(String str) {
        if (str == null | str.length() <= 1) return str;
        String s = reverse(str);
        String result = "";
        int start = 0;
        int end = start;
        System.out.println(s);
        while (start < str.length()) {
            end = start;
            while (end < str.length() && s.charAt(end) != ' ') {
                end ++;
            }
            String tmp = reverse(s.substring(start, end));
            System.out.println("tmp: " + tmp + "          result:" + result);
            result = result.concat(tmp);
            if (end != str.length()) {
                result = result.concat(" ");
            }
                
            start = end + 1;
        }
        return result;
        
    }
    public static void main(String[] args) {
        String s = ReverseSentence("I am a students.");
        System.out.println(s);
    }
}