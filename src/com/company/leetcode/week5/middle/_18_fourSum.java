package com.company.leetcode.week5.middle;

import java.util.*;


public class _18_fourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length < 4) return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for(int i = 0;i < nums.length - 3;i++){
//            System.out.println(i);
            List<List<Integer>> tmp = threeSum(nums,i + 1,nums.length - 1,target - nums[i]);
            System.out.println(tmp);
            for(List<Integer> r : tmp){
                r.add(nums[i]);
                result.add(r);
            }
        }
        return new ArrayList<>(result);

    }
    public static List<List<Integer>> threeSum(int[] nums,int start_index,int end_index,int target){
        System.out.println(Arrays.toString(nums) + "start_index:"+start_index + "end_index: "+ end_index+"target;" + target);
        if(nums.length < 3)return new ArrayList<>();
//        Arrays.sort(nums);
        int L;
        int R;
        Set<List<Integer>> result = new HashSet<>();
        for(int i = start_index;i < end_index - 1;i++){
            L = i + 1;
            R = end_index;
            if(!(i > 0 && nums[i] == nums[i - 1])){
                while (L < R){
                    if(nums[i] + nums[L] + nums[R] == target){
                        ArrayList<Integer> r = new ArrayList<>();
                        r.add(nums[i]);
                        r.add(nums[L]);
                        r.add(nums[R]);
                        result.add(r);
                        L++;
                        R--;
                    }else if(nums[i] + nums[L] + nums[R] > target){
                        R--;
                    }else if(nums[i] + nums[L] + nums[R] < target){
                        L++;
                    }
                }
            }


        }
        return new ArrayList<>(result);

    }

    public static void main(String[] args){
        List<List<Integer>>result = fourSum(new int[]{-1,0,1,2,-1,-4},0);
        System.out.println(result);
    }
}
