package com.company.leetcode.week1.easy;

import java.util.ArrayList;

/**
 * created by benyafang on 2019/10/17 9:10
 * 内存消耗
 * */
public class _66_plusOne {
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        digits[len - 1] += 1;
        int i = len - 1;
        while (digits[i] > 9 && i > 0){
            digits[i] = 0;
            i--;
            digits[i] += 1;
        }
        ArrayList<Integer> res1 = new ArrayList<Integer>();
        if(i == 0 && digits[i] > 9){
            digits[i] = 0;
            int [] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        return digits;

    }
    public static void main(String[] args){
//        int [] res = new int[3];
//        res[0] = 2;
//        for(int j : res){
//            System.out.println(j);
//        }
//        System.out.println(res);

        int [] res1 = plusOne(new int[]{9,9,9});
        for(int j : res1){
            System.out.println(j);
        }

    }
}
