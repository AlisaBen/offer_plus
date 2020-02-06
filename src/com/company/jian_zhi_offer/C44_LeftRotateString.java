package com.company.jian_zhi_offer;

public class C44_LeftRotateString {
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
    public static String LeftRotateString(String str,int n) {
        if (n == 0 || str.length() <= 1) return str;
        n = n % str.length();
        //前0--n-1
        String s2 = reverse(str.substring(0, n));
        String s3 = reverse(str.substring(n, str.length()));
        return reverse(s2 + s3);
    }
    public static void main(String[] args) {
        String s = LeftRotateString("abcdefg", 2);
        System.out.println(s);
    }
}