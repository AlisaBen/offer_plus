package com.company.leetcode.week5.easy;

/**
 * created by Arya on 2019/11/23 14:26
 * 两数之和，输入有序数组
 * */
public class _167_twoSum {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0,j = numbers.length - 1;
        while (i < j){
            if(numbers[i] + numbers[j] == target)return new int[]{i + 1,j + 1};
            else if(numbers[i] + numbers[j] < target)i++;
            else j--;
        }
        return new int[]{};
    }
}
