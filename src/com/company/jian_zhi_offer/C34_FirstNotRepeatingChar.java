package com.company.jian_zhi_offer;

import java.util.ArrayList;

import java.util.Arrays;
/**第一个只出现一次的字符 */
public class C34_FirstNotRepeatingChar {
    public static int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) return -1;
        int[] singleChar = new int[256]; // 初始化数组字符出现的次数为0，字符256个
        for(int i = 0; i < str.length();i++) {
            int pos = str.charAt(i);
            singleChar[pos] += 1;
        }
        int i = 0;
        for(; i < str.length();i++) {
            int pos = str.charAt(i);
            if (singleChar[pos] == 1) break;
        }
        return i == str.length() ? -1 : i;
    }
    public static void main(String[] args) {
        String s = "aaaa";
        int a = FirstNotRepeatingChar(s);
        System.out.println(a);
        int[] aa = new int[3];
        System.out.println(Arrays.toString(aa));
        System.out.println((int) 'a');
    }
}