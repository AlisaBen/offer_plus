package com.company.leetcode.week3.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _260_singleNumber {
    public static int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            if(map.containsKey(nums[i]))map.put(nums[i],map.get(nums[i]) + 1);
            else map.put(nums[i],1);
        }
        ArrayList<Integer> tmp = new ArrayList<>();
        for(Integer t :map.keySet()){
            if(map.get(t) == 1)tmp.add(t);
        }
        int[] result = new int[tmp.size()];
        for(int i = 0;i < tmp.size();i++){
            result[i] = tmp.get(i);
        }
        return result;
    }
    public static void main(String[] args){
        int [] nums= {1,2,3,4,2,3};
        int[] result = singleNumber(nums);
        System.out.println(Arrays.toString(result));
    }
}
