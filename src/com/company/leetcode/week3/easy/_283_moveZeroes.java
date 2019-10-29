package com.company.leetcode.week3.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class _283_moveZeroes {
    public static void moveZeroes(int[] nums) {
        /**
         * n^2不管怎樣，都执行了赋值操作
         * */
        int j = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i]!=0)continue;
            j = i+1;
            while (j < nums.length && nums[j] == 0)j++;
            if(j < nums.length){
                nums[i] = nums[j];
                nums[j] = 0;
            }

        }
    }
    public static void moveZeroes1(int[] nums) {
        int j = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i]!=0)continue;
            j = Math.max(i+1,j);
            while (j < nums.length && nums[j] == 0)j++;
            if(j < nums.length){
                nums[i] = nums[j];
                nums[j] = 0;
            }

        }

    }
    public static void main(String[] args){
        int[] nums= {0,0,3,5,7,0,0,0,0,27,8,0,1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
