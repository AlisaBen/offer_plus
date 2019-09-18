package com.company.jian_zhi_offer;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 保证base和exponent不同时为0
 * */
public class C9_Power {
    public static double Power(double base, int exponent) {
        if(base == 0) return 0;
        if(exponent == 0)return 1;
        if(exponent > 0){
            return Power(base,exponent-1) * base;
        }else{
            return 1 / Power(base,-exponent);
        }
    }
    public static void main(String[] args){
        System.out.println(Power(2,-10));
    }
}
