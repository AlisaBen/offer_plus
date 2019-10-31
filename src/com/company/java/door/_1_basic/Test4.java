package com.company.java.door._1_basic;

import java.math.BigDecimal;

/**
 * created by benyafang on 2019/10/31 11:07
 * BigDecimal
 * 精度损失
 * 保留小数
 * 比较大小
 * BigDecimal 主要用来操作（大）浮点数，BigInteger 主要用来操作大整数（超过 long 类型）。
 * */
public class Test4 {
    public static void main(String[] args){
        float a = 1.0f - 0.9f;//0.100000024
        float b = 0.9f - 0.8f;//b:0.099999964
        System.out.println("a:"+a+" b:"+b);

        BigDecimal x = new BigDecimal("1.0");
        BigDecimal y = new BigDecimal("0.9");
        BigDecimal z = new BigDecimal("0.8");
        BigDecimal xx = x.subtract(y);
        BigDecimal yy = y.subtract(z);
        System.out.println(xx.equals(yy));//true

        System.out.println(x.compareTo(y));//1
        System.out.println(x.compareTo(x));//0
        System.out.println(y.compareTo(x));//-1

        BigDecimal m = new BigDecimal("1.25555");
        BigDecimal n = m.setScale(3,BigDecimal.ROUND_HALF_DOWN);
        System.out.println(n);//1.256



    }
}
