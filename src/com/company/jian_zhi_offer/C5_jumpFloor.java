package com.company.jian_zhi_offer;

public class C5_jumpFloor {
    public static int jumpFloor(int number){
        if(number == 0) return 0;
        if(number == 1) return 1;
        if(number == 2) return 2;
        return jumpFloor(number - 1) + jumpFloor(number - 2);
    }

    public static void main(String[] args){
        System.out.println(jumpFloor(3));
        System.out.println(jumpFloor(4));
        System.out.println(jumpFloor(5));
    }
}
