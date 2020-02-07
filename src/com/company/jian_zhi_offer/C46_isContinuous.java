package com.company.jian_zhi_offer;

import java.util.Arrays;
public class C46_isContinuous {
    public static boolean isContinuous(int [] numbers) {
        //可数目不够，可能存在相等的数字
        if (numbers == null || numbers.length < 5) return false;
        Arrays.sort(numbers);
        int zeroCount = 0; // 任意牌的数量
        int gap = 0; // 分开的数量
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) zeroCount ++;
            else if (i != 0 && numbers[i] != 0 && numbers[i - 1] != 0 && numbers[i] != numbers[i-1] + 1) {
                gap += numbers[i] - numbers[i - 1] - 1;
                if (numbers[i] > numbers[i - 1] + 1) count++;
            } else count ++;
        }
        System.out.println("zero:" + zeroCount + "  gap: " + gap + "  count:" + count);
        return zeroCount >= gap && count + zeroCount >= 5;
        //zeroCount <= 2

    }
    public static void main(String[] args) {
        int[] a = {1,0,0,5,0};
        boolean s = isContinuous(a);
        System.out.println(s);
    }
}