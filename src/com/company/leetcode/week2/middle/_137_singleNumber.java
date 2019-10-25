package com.company.leetcode.week2.middle;

import java.util.HashMap;
import java.util.Map;

public class _137_singleNumber {
    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i < nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],-1);
            }else{
                map.put(nums[i],i);
            }
        }
        for(Integer key:map.keySet()){
            if(map.get(key) != -1){
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] height = {1,1,2,3,4,1,1,4,3};
        int result = singleNumber(height);
        System.out.println(result);
    }
}
