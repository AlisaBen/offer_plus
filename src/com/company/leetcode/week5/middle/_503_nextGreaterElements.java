package com.company.leetcode.week5.middle;


import java.util.Arrays;
import java.util.Stack;

/**
 * created by Arya on 2019/11/23 12:14
 * 解决思路通739题
 * 给定循环数组，那么数组不分前后，从头开始遍历，同样用栈存储索引
 * 每次向下遍历一个元素，更新栈中的索引对应ans数值，如果比栈中的元素大，出栈，更新数值将该元素进栈；
 * 否则，将该元素进栈，
 * 数组元素遍历结束之后，判断栈是否为空，如果栈不空将再次重头遍历数组，因为数组是循环的e
 * 判断截止的条件是所选的元素的索引要大于栈中存储的索引，最多遍历一遍数组
 * */
public class _503_nextGreaterElements {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[nums.length];
        Arrays.fill(ans,-1);
        for(int i = 0;i < nums.length ;i++){
            while (!s.empty() && nums[s.peek()] < nums[i]){//栈顶索引的元素小于现在的元素
                ans[s.peek()] = nums[i];
                s.pop();
            }
            s.push(i);
        }
        if (!s.empty()){
            for(int i = 0;i < nums.length;i++){
                while (!s.empty() && i < s.peek() && nums[i] > nums[s.peek()]){
                    ans[s.peek()] = nums[i];
                    s.pop();
                }
            }
        }
        return ans;
    }
}
