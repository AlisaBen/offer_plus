package com.company.leetcode.week1.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1/10
 * created by benyafang on 2019/10/18 15:57
 * */
public class _46_permute {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length;i++){
            if(result.size() == 0){
                List<Integer> tmp = new ArrayList<>();
                tmp.add(nums[i]);
                result.add(tmp);
            }else{
                int len = result.size();
                for(int j = 0;j < len;j++){
                    for(int k = 0; k <= result.get(j).size();k++){
                        List<Integer> x = new ArrayList<>(result.get(j));
                        x.add(k,nums[i]);
                        result.add(x);
                        System.out.println("x:"+x);
                        System.out.println("result:"+result);
                    }
                }
                while (len > 0){
                    result.remove(result.get(len - 1));
                    len --;
                }
            }
        }
//        List<List<Integer>> res = new ArrayList<>(result);

        return new ArrayList<>(result);
    }

    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(5);
        a.add(10);
//        a.remove(34);
//        System.out.println("000");
        List r = permute(new int[]{1,2,3});
        System.out.println(r);
        ArrayList<Integer> b = new ArrayList<>(a);
        for(int i = 0; i < b.size();i++){
            System.out.println(b.get(i));
//            a.add(a.get(i) * 2);
//            a.remove(a.get(i));
//            System.out.println(a.size());
        }
        List<Integer> ss = new ArrayList<>();
        ss.add(56);
        System.out.println(ss);
        System.out.println("===");
        int len = a.size();
        for(int i = 0; i < len;i++){
//            System.out.println(a.get(i));
            a.add(a.get(i) * 2);
//            a.remove(a.get(i));
//            System.out.println(a.size());
        }
        System.out.println(len);
        while (len > 0){
            System.out.println(a.get(len - 1));
            a.remove(a.get(len - 1));
            len--;
        }
        for (int i = 0; i < a.size();i++){
            System.out.println(a.get(i));
//            a.remove(a.get(i));
        }
//        for(int i = 0; i < a.size();i++){
//            System.out.println(a.get(i));
////            a.add(i * 2);
//////            a.remove(a.get(i));
////            System.out.println(a.size());
//        }
//        System.out.println(a.size());
//        System.out.println(a.get(0));
    }
}
