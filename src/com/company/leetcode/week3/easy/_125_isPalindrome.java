package com.company.leetcode.week3.easy;

public class _125_isPalindrome {
    public static boolean isValid(char c){
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || Character.isDigit(c);
    }
    public static boolean isPalindrome(String s) {
        if(s.length() <= 1)return true;
        int i = 0;
        int j = s.length() - 1;
        while (i < j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(!isValid(c1)){
                i++;
                continue;
            }
            if(!isValid(c2)){
                j--;
                continue;
            }
            if(Character.isDigit(c1) && Character.isDigit(c2)){
                if(c1 == c2){
                    i++;
                    j--;
                }else return false;
            }else if(!Character.isDigit(c1) && !Character.isDigit(c2)){
                if(Character.toLowerCase(c1) == Character.toLowerCase(c2)){
                    i++;j--;
                }else return false;
            }else return false;

        }
        return true;

    }
    public static void main(String[] args){
//        System.out.println(isValid('c'));
//        System.out.println(isValid('A'));
//        System.out.println(isValid('2'));
//        System.out.println(isValid(';'));
//        System.out.println(Character.toLowerCase('A'));
        boolean result = isPalindrome("race a car");
        System.out.println(result);

    }

}
