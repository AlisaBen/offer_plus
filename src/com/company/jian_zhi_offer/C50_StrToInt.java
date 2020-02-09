package com.company.jian_zhi_offer;

public class C50_StrToInt {
    public static int StrToInt(String str) {
        if (str == "" || str.length() == 0) return 0;
        char[] strs = str.toCharArray();
        // 判断是不是负数
        int negative = 0; // 不是负数
        int positiveNum = 0; // 加号的数量
        if (strs[0] == '-') negative = 1; // 是负数
        int sum = 0;
        for (int i = negative; i < strs.length;i++) {
            // 从不是符号的那一位开始
            if (strs[i] == '+' && ++positiveNum <= 1) continue; 
            else if (strs[i] == '+') return 0; // 加号的数量多了
            else {
                // 不是加号
                if (strs[i] < 48 || strs[i] > 57) return 0; // 0-9以外的数字
                sum = 10 * sum + strs[i] - 48;
            }
        }
        sum = negative == 0 ? sum : - sum;
        if (negative == 0 && sum > Integer.MAX_VALUE || negative == 1 && sum > 0) {
            return 0;
        }
        return sum;

    }
    public static void main(String[] args) {
        System.out.println(StrToInt("2147485649"));
    }
}