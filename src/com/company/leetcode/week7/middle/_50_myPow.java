package com.company.leetcode.week7.middle;

/**
 * created by Arya on 2019.12.7 15:21
 * */
public class _50_myPow {
    public double myPow(double x, int n) {
        if(x == 0.0) return 0;
        if(n == 0) return 1;
        if(n < 0){
            n = -n;
            x = 1 / x;
        }
        double res = 1.0;
        for(int i = 1; i <= n;i++){
            res *= x;
        }
        return res;
    }
    public double fastPow(double x,int n){
        if(n == 0)return 1.0;
        double half = fastPow(x,n / 2);
        if(n % 2 == 0)return half * half;
        else return half * half * x;
    }
    public double myPow1(double x, int n) {
        if(x == 0.0) return 0;
        if(n == 0) return 1;
        if(n < 0){
            n = -n;
            x = 1 / x;
        }
        return fastPow(x,n);
    }
    public static void main(String[] args){
        System.out.println(0 == 0.0);
        System.out.println();
    }
}
