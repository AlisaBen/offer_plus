package com.company.jian_zhi_offer;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * */
public class C6_jumpFloorII {
    public static int jumpFloorII(int number) {
        if(number == 1) return 1;
        if(number == 0) return 0;
        if(number == 2) return 2;
        int tmp = 1;
        while (number > 0){
            tmp += jumpFloorII(number - 1);
            number--;
        }
        return tmp;
    }
    public static void main(String[] args){
        System.out.println(jumpFloorII(3));
        System.out.println(jumpFloorII(4));
        System.out.println(jumpFloorII(5));
    }


}
