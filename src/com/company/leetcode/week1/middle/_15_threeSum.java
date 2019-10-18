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

    public static Set<List<Integer>> twoSum2(int [] nums,int target){
        Map<Integer,Integer> tmp = new HashMap<>();
        Set<List<Integer>> res = new HashSet<>();
        for(int i = 0; i < nums.length;i++){
            int component = target - nums[i];
            if(tmp.containsKey(component)){
                List<Integer> tt = new ArrayList<>();
                tt.add(component);
                tt.add(nums[i]);
                tt.sort(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1.compareTo(o2);
                    }
                });
                res.add(tt) ;
            }
            tmp.put(nums[i],i);
        }
        return res;
//        throw new IllegalArgumentException("");
    }

    public static List<List<Integer>> threeSum1(int[] nums){
        Map<Integer,Integer> tmp = new HashMap<>();
        Set<List<Integer>> result = new HashSet<>();
        if(nums.length <= 2)return new ArrayList<>(result);
        for(int x:nums){
            if(tmp.containsKey(x))tmp.put(x,tmp.get(x) + 1);
            else tmp.put(x,1);
        }
        for(int i:nums){
            Set<List<Integer>> res = twoSum2(nums,- i);
            for(List<Integer> x:res){
                    if(x.get(0) == i && x.get(1) == i && tmp.get(i) >= 3
                            ||  (x.get(0) == i && x.get(1) != i || x.get(1) == i && x.get(0) != 0) &&tmp.get(i) >= 2
                            || !x.contains(i)
                            ){
                        x.add(i);
                        x.sort(new Comparator<Integer>() {
                            @Override
                            public int compare(Integer o1, Integer o2) {
                                return o1.compareTo(o2);
                            }
                        });
                        result.add(x);
                    }

            }
        }
        return new ArrayList<>(result);
    }

    public static List<List<Integer>> threeSum2(int[] nums){
        if(nums.length < 3)return new ArrayList<>();
        Arrays.sort(nums);
        int L;
        int R;
        Set<List<Integer>> result = new HashSet<>();
        for(int i = 0;i < nums.length - 2;i++){
            L = i + 1;
            R = nums.length - 1;
            if(!(i > 0 && nums[i] == nums[i - 1])){
                while (L < R){
                    if(nums[i] + nums[L] + nums[R] == 0){
                        ArrayList<Integer> r = new ArrayList<>();
                        r.add(nums[i]);
                        r.add(nums[L]);
                        r.add(nums[R]);
                        result.add(r);
                        L++;
                        R--;
                    }else if(nums[i] + nums[L] + nums[R] > 0){
                        R--;
                    }else if(nums[i] + nums[L] + nums[R] < 0){
                        L++;
                    }
                }
            }


        }
        return new ArrayList<>(result);

    }


    public static void main(String[] args){
        List<List<Integer>> res = threeSum2(new int[]{-2,0,0,2,2});
        System.out.println(res);
    }
}
