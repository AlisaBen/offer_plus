package com.company.leetcode.week3.easy;

import java.util.*;

public class _349_intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Boolean> map = new HashMap<>();
        for(int i = 0;i < nums1.length;i++){
            map.put(nums1[i],false);
        }
        for(int i = 0;i < nums2.length;i++){
            if(map.containsKey(nums2[i]))map.put(nums2[i],true);
        }

        List<Integer> result = new ArrayList<>();
        for(Integer t:map.keySet()){
            if(map.get(t)){
                result.add(t);
            }
        }

        int [] num = new int[result.size()];
        for(int i = 0; i < result.size();i++){
            num[i] = result.get(i);
        }
        return num;
    }
    public static void main(String[] args){
        Set<Integer> s = new HashSet<>();
        s.add(34);
        System.out.println(s.contains(34));
        int[] nums1 = {1,2,3,3,3,4};
        int[] nums2 = {2,2,6,2,7,3};
        int[] result = intersection(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
}
