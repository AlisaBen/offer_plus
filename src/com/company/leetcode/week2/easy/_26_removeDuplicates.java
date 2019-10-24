package com.company.leetcode.week2.easy;

import java.util.Arrays;

public class _26_removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0)return 0;
        if(nums.length == 1)return 1;
        int i = 0,j = 1;
        while (j < nums.length && i < j){
            if(nums[i] == nums[j]){
                j++;
            }else{
                nums[++i] = nums[j];
                j++;
            }
        }

        return i+1;
    }
    public static void main(String[] args){
        int[] input = {0,0,3,4,5,5,5,5,6,7};
        int num = removeDuplicates(input);
        System.out.println(num);
        System.out.println(Arrays.toString(input));
    }
}
