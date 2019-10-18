package com.company.leetcode.week1.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * created by benyafang on 2019/10/15 22:30
 * */
public class _1_twoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++){
                for(int j = i+1; j < nums.length;j++){
                    if(nums[i] + nums[j] == target)return new int[]{i,j};
                }
        }
        throw new IllegalArgumentException("no sum");
    }
    public static int[] twoSum1(int [] nums,int target){
        Map<Integer,Integer> tmp = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            tmp.put(nums[i],i);
        }
        for(int i = 0;i < nums.length;i++){
            if(tmp.containsKey(target - nums[i]) && tmp.get(target - nums[i]) != i){
                return new int[]{i,tmp.get(target - nums[i])};
            }
        }
        throw new IllegalArgumentException("");
    }


    public static void main(String[] args){
        int[] res = twoSum(new int[]{-1,-2,-3,-4,-5},-8);

        for (int i : res){
            System.out.println(i);
        }

    }
}
