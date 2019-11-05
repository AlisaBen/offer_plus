package com.company.leetcode.week3.middle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 回溯法
 * */
public class _77_combine {
    List<List<Integer>> output = new LinkedList<>();
    int n;
    int k;
    public void backtrack(int first, LinkedList<Integer> curr){
        if(curr.size() == k)
            output.add(new LinkedList<>(curr));
        for(int i = first;i < n + 1; ++i){
            curr.add(i);
            backtrack(i + 1, curr);
            curr.removeLast();
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        backtrack(1,new LinkedList<>());
        return output;
    }
    public List<List<Integer>> combine1(int n,int k){
        LinkedList<Integer> nums = new LinkedList<>();
        for(int i = 1;i < k + 1; ++i){
            nums.add(i);
        }
        nums.add(n + 1);
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        int j = 0;
        while (j < k){
            output.add(new LinkedList<>(nums.subList(0,k)));
            j = 0;
            while ((j < k) && (nums.get(j + 1) == nums.get(j) + 1))
                nums.set(j,j ++ + 1);
            nums.set(j,nums.get(j) + 1);
        }
        return output;

    }
}
