package com.company.leetcode.week1.easy;

/**
 * created by benyafang on 2019/10/17 23:00
 * */
public class _171_titleToNumber {
    public static int titleToNumber(String s) {
        int len = s.length();
        int res = 0;
        for(int i = 0;i < len;i++){
            String subStr = s.substring(i,i+1);
            res += Math.pow(26,i) + subStr.compareTo("A") * Math.pow(26,len - i - 1);
        }
        return res;
    }
    public static void main(String[] args){
        String s = "a";
        String s1 = "A";
        String s2 = "AA";
        /**
         * compareTo比较相等部分的字符串
         * 相等部分的字符串进行ASCII码加减
         * “abcf”与"abcfd"返回的值就是+-1
         * “abcf"与"bcdfd"返回的值就是+-1
         * 只要遇到一个不一样的字母就会返回
         * */
//        int a = s.compareTo(s1);//返回ASCII码的差值
//        System.out.println(s2.compareTo(s1));
//        System.out.println(a);
//        System.out.println("abc".compareTo("abcd"));
//        System.out.println("abc".compareTo("bcdf"));
//        System.out.println("abc".compareTo("bcd"));
//        System.out.println("abc".compareTo("add"));
        System.out.println(titleToNumber("AZ"));
    }

}
