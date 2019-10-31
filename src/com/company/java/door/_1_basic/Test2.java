package com.company.java.door._1_basic;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args){
        int[] nums = new int[4];
        nums[3] = 5;
        nums[1] = 4;
        nums = Arrays.copyOf(nums,6);//数组按照指定的大小进行扩容
        System.out.println(Arrays.toString(nums));
    }
}
