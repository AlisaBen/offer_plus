package com.company.microsoft;

import java.util.HashSet;
import java.util.Set;


/**
 * 输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。例如，输入”They are students.”和”aeiou”， 则删除之后的第一个字符串变成”Thy r stdnts.”。
 */
class _40DeleteString {
    public static String deleteStr(String s1, String s2) {
        if (s1.length() == 0 || s2.length() == 0) return s1;

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s2.length(); i ++) {
            set.add(s2.charAt(i));
        }
        StringBuilder string = new StringBuilder("");
        for (int i = 0; i < s1.length(); i++){
            char c = s1.charAt(i);
            if (!set.contains(c)) string.append(String.valueOf(c));
        }
        return string.toString();


    }
    public static void main(String[] args) {
        // String s1 = "They are students.";
        // String s2 = "aeiou";
        // String s = deleteStr(s1, s2);
        // System.out.print(s);
        StringBuilder string = new StringBuilder("");
        string.append("3");
        string.insert(0, "r");
        char c = string.charAt(0);
        int len = string.length();
        string.delete(0, 1);
        string.replace(0, 1, "45");
        System.out.println( len + string.toString() + c);
        Set<Integer> set = new HashSet<>();
        set.size();
        set.contains(4);
        set.isEmpty();
        set.remove(4);
        

    }
}