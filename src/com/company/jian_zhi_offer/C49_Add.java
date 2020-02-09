package com.company.jian_zhi_offer;

public class C49_Add {
    public static int Add(int num1,int num2) {
        int a = num1 ^ num2;
        int b = (num1 & num2) << 1;
        return a == 0 ? b : (b == 0 ? a :Add(a,b)) ;
    }
    public static void main(String[] args) {
        int a = Add(11, 4);
        System.out.println(a);
    }
}