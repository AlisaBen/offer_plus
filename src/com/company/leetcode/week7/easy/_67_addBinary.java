package com.company.leetcode.week7.easy;

/**
 * created by Arya on 2019.12.8 12:36
 * 二进制求和
 *
 * */
public class _67_addBinary {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int ca = 0;
        for(int i = a.length() - 1,j = b.length() - 1;i >= 0 || j >= 0;i--,j--){
            int sum = ca;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;////因为限制条件是有一个索引大于等于0就可以，所以要判断一下,
            sum += j >= 0 ? b.charAt(j) - '0' : 0;

            ans.append(sum % 2);////十进制转化为二进制
            ca = sum / 2;////1表示有进位，0表示没有进位
        }
        ans.append(ca == 1 ? ca : "");//如果有进位就添加一个1，没有就是空
        return ans.reverse().toString();//需要把字符串翻转一下
    }
}
