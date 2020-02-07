package com.company.jian_zhi_offer;

import java.util.Arrays;
public class C48_Sum_Solution {
    public static int Sum_Solution(int n) {
        int res = n;
        boolean flag = (n > 0) && ((res += Sum_Solution(n - 1)) > 0);
        return res;
    }
    public static void main(String[] args) {
        int s = Sum_Solution(4);
        System.out.println(s);
    }
}