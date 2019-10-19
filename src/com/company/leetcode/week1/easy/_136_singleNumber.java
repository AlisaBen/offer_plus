package com.company.leetcode.week1.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * created by benyafang on 2019/10/17 9:10
 * 内存消耗
 * 位运算，异或
 * */
public class _136_singleNumber {
    public static int singleNumber(int[] nums) {
        int v = 0 ;
        for(int x:nums){
            v ^= x;
        }
        return v;
    }
    public static void main(String[] args){
        System.out.println(singleNumber(new int[]{2}));
    }
}
