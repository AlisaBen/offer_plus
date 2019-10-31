package com.company.java.door._1_basic;

import java.util.Arrays;

/**
 * created by benyafang on 2019/10/31 22:46
 * 快排
 * */
public class Test7 {
    public static void quick_sort(int[] nums,int low,int high){
        int data;//基准
        int index = low;//基准所应该存储的位置
        int i = low + 1;
        int j = high;
//        int i,j;
        if(low < high){
            data = nums[low];
            for(;j >= i;j--){
                if(nums[j] < data){
                    nums[index] = nums[j];//将小的元素，赋值到左边
                    index = j;//基准存储位置指向j

                    for(;i <= j;i++){
                        if(nums[i] > data){
                            nums[index] = nums[i];
                            index = i;
                            i++;
                            break;
                        }
                    }
                }
            }
            if(index != low)nums[index] = data;
            quick_sort(nums,low,index - 1);
            quick_sort(nums,index + 1,high);
        }

    }
    public static void main(String[] args){
        int[] nums = {3,1,};
        quick_sort(nums,0,nums.length - 1);
        System.out.println(Arrays.toString(nums));

    }
}
