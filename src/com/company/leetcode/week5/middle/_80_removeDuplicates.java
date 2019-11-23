package com.company.leetcode.week5.middle;

import java.util.Arrays;

/**
 * created by Arya on 2019.11.23 14:41
 *
 * */
public class _80_removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        int size = nums.length;
        if(size < 3)return size;
        int n = 1;//当前元素的出现次数
        int store = 0;//当前已经确定的元素的位置
        for(int i = 1;i < size;i++){
            if(nums[i] == nums[store]){
                if(n == 2){
                    //该元素已经出现了两次了，现在出现的元素要被摒弃
                }else{
                    n++;//该元素还没有出现两次
                    nums[++store] = nums[i];//store++,将i指向的元素赋值给store
                }
            }else{//store存储的元素和当前遍历的元素不一样
                n = 1;//n重新赋值
                nums[++store] = nums[i];//下一个位置赋值
            }
        }
        return store + 1;
    }
    public static void main(String[] args){
        int[] nums = new int[]{1,1,1,2,2,3};
        int res = removeDuplicates(nums);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));
    }
}
