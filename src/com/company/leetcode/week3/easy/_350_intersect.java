package com.company.leetcode.week3.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _350_intersect {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        for(int i = 0; i < nums1.length;i++){
            if(map1.containsKey(nums1[i]))map1.put(nums1[i],map1.get(nums1[i]) + 1);
            else map1.put(nums1[i],1);
        }
        for(int i = 0; i < nums2.length;i++){
            if(map2.containsKey(nums2[i]))map2.put(nums2[i],map2.get(nums2[i]) + 1);
            else map2.put(nums2[i],1);
        }
        ArrayList<Integer> tmp = new ArrayList<>();
        for(Integer t:map1.keySet()){
            if(map2.containsKey(t)){
                int num = Math.min(map1.get(t),map2.get(t));
                while (num > 0){
                    tmp.add(t);
                    num--;
                }
            }
        }
        int[] result = new int[tmp.size()];
        for(int i = 0; i < tmp.size();i++){
            result[i] = tmp.get(i);
        }


        return result;
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,3,3,3,4};
        int[] nums2 = {2,2,6,2,7,3,3};
        int[] result = intersect(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
}
