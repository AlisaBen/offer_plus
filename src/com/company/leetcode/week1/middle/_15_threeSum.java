package com.company.leetcode.week1.middle;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.*;

/**
 * created by benyafang on 2019/10/16 23:46
 * List与ArrayList和new int[]的区别
 * */
public class _15_threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        int i,j,k;
        Set<List<Integer>> res = new HashSet<>();
        for(i = 0;i < nums.length - 2;i++){
            for(j = i + 1;j < nums.length - 1;j++){
                for(k = j + 1;k < nums.length;k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);
                        Collections.sort(tmp, new Comparator<Integer>() {
                            @Override
                            public int compare(Integer o1, Integer o2) {
                                return o1.compareTo(o2);
                            }
                        });
                        res.add(tmp);
                    }
                }
            }
        }
        return new ArrayList<>(res);

    }
    public static void main(String[] args){
        Set<List<Integer>> a = new HashSet<>();
        List<Integer> a1 = new ArrayList<>();
        a1.add(3);
        a1.add(4);
        List<Integer> a2 = new ArrayList<>();
        a2.add(3);
        a2.add(4);
        a.add(a1);
        a.add(a2);
//        a.add(4);
//        a.add(4);
        System.out.println(a);
        List<List<Integer>> res = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        for(int i = 0; i < res.size();i ++){
            System.out.println(res.get(i));
        }
    }
}
