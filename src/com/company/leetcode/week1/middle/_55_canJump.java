package com.company.leetcode.week1.middle;

import java.util.Arrays;

/**
 * created by benyafang on 2019/10/18 16:03
 * */
public class _55_canJump {
    public static boolean canJump(int[] nums) {
        if(nums.length <= 1)return true;
        for(int i = 0; i < nums.length - 1;i++){
//            if(!canJump(Arrays.copyOfRange(nums,0,i + 1)))
            if(canJump(Arrays.copyOfRange(nums,0,i + 1)) && nums[i] >= (nums.length - 1 - i)){
                return true;
            }
        }
        return false;

    }

    public static boolean canJump1(int[] nums) {
        if(nums.length <= 1)return true;
        for(int i = nums.length - 2; i >= 0;i--){
            if(nums[i] == 0 && !jumpZero(Arrays.copyOfRange(nums,0,i),i)){
                return false;
            }
        }
        return true;

    }

    public static boolean jumpZero(int[] nums,int index){
        for(int i = nums.length - 1; i >= 0;i--){
            if(nums[i] > index - i)return true;
        }
        return false;
    }

    public static void main(String[] args){
        boolean res = canJump1(new int[]{8,2,4,4,4,9,5,2,5,8,8,0,8,6,9,1,1,6,3,5,1,2,6,6,0,4,8,6,0,3,2,8,7,6,5,1,7,0,3,4,8,3,5,9,0,4,0,1,0,5,9,2,0,7,0,2,1,0,8,2,5,1,2,3,9,7,4,7,0,0,1,8,5,6,7,5,1,9,9,3,5,0,7,5});
//        boolean res = canJump1(new int[]{2,0,0});

        System.out.println(res);
    }
}
