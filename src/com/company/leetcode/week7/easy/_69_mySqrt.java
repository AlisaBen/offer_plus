package com.company.leetcode.week7.easy;

/**
 * created by Arya on 2019.12.8 13:30
 * x的平方根
 *
 * */
public class _69_mySqrt {
    public int mySqrt(int x) {
        //2147395599
        if(x <= 0) return 0;
        if(x == 1) return 1;
        long left = 1;
        long right = x / 2;
        long middle = (left + right) / 2;
        while (true){
            if(middle * middle <= x && (middle + 1) * (middle + 1) > x){
                return (int)middle;
            }
            if(middle * middle < x){
                left = middle + 1;
            }else{
                right = middle - 1;
            }
            middle = (left + right) / 2;
        }

    }
}
