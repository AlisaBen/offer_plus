package com.company.leetcode.week1.easy;

/**
 * created by benyafang on 2019/10/15 22:30
 * */
public class _1_twoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++){
//            if(nums[i] <= target){
                for(int j = i+1; j < nums.length;j++){
//                    System.out.println(j);
                    if(nums[i] + nums[j] == target)return new int[]{i,j};
                }
//            }
        }
        return new int[]{};
    }

    public static void main(String[] args){
        int[] res = twoSum(new int[]{-1,-2,-3,-4,-5},-8);

        for (int i : res){
            System.out.println(i);
        }

    }
}
