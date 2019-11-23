package com.company.leetcode.week5.easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

/**
 * created by Arya on 2019/11/23 11:44
 *
 * 下一个最大的元素，解决的思路通739题目
 * 可优化的地方，是否可以以nums1为基准进行判断，方法内部有冗余的信息，比如Nums2中有些元素的下一个比它大的元素是我不需要的
 * 另外，额外的空间上，开辟了两个数组和一个map
 * */
public class _496_nextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums2.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for(int i = nums2.length - 1;i >= 0;i--){
            while (!s.empty() && nums2[s.peek()] <= nums2[i])s.pop();
            ans[i] = s.empty() ? -1 : nums2[s.peek()];
            s.push(i);
            map.put(nums2[i],i);
        }
        int[] ans1 = new int[nums1.length];
        for(int i = 0;i < nums1.length;i++){
            ans1[i] = ans[map.get(nums1[i])];
        }
        return ans1;
    }

}
