package com.company.leetcode.week5.middle;

import java.util.Arrays;

/**
 * created by Arya on 2019.11.23 15:38
 * 颜色分类
 * 三个指针，分别指向0的右侧边界和2的左侧边界，如果指向的元素为1，仅移动curr索引，等到curr指向0的时候进行交换，即可保证1在中间位置
 *
 * */
public class _75_sortColors {
    public static void sortColors(int[] nums) {
        int p0= 0,p1 = nums.length-1;
        int curr = 0;
        while (curr <= p1){
            if(nums[curr] == 2){
                int tmp = nums[p1];
                nums[p1--] = nums[curr];
                nums[curr] = tmp;
            }else if(nums[curr] == 0){
                int tmp = nums[p0];
                nums[p0++] = nums[curr];
                nums[curr++] = tmp;
            }else{
                curr++;
            }
            System.out.println(Arrays.toString(nums));
        }

    }
    public static void main(String[] args){
        sortColors(new int[]{2,0,1});

    }
}
