package com.company.leetcode.week5.middle;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.Stack;

/**
 *
 * created by Arya on 2019.11.23 14:20
 * 方法一：栈存储数组中前k大的元素
 * 方法二：堆排序
 * 方法三：快排
 *
 * 快排的交换还需要仔细看下
 * */
public class _215_findKthLargest {
    public int findKthLargest(int[] nums, int k) {
        Stack<Integer> s = new Stack<>();
        int num = 0;
        for(int i = 0;i < nums.length;i++){
            boolean insert_flag = false;
            Stack<Integer> tmp = new Stack<>();
            if(num == k && s.peek() < nums[i]){
                s.pop();
                insert_flag = true;
            }
            else if(num < k){
                num ++;
                insert_flag = true;
            }
            if(insert_flag){
                while (!s.empty() && s.peek() < nums[i]){
                    tmp.push(s.pop());
                }
                s.push(nums[i]);
                while (!tmp.empty())s.push(tmp.pop());
            }

        }
        return s.peek();
    }
    public int findKthLargest1(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1,n2) -> n2 - n1);
        for(int n:nums){
            heap.add(n);
            if(heap.size() > k){
                heap.poll();
            }
        }
        return heap.isEmpty() ? -1 : heap.peek();
    }
    int[] nums;
    public void swap(int a,int b){
        int tmp = this.nums[a];
        this.nums[a] = this.nums[b];
        this.nums[b] = tmp;
    }
    public int partition(int left,int right,int pivot_index){
        int pivot = this.nums[pivot_index];
        swap(pivot_index,right);
        int store_index = left;
        for(int i = left;i <= right;i++){
            if(this.nums[i] < pivot){
                swap(store_index,i);
                store_index ++;
            }
        }
        swap(store_index,right);
        return store_index;

    }
    public int quickselect(int start_index,int end_index,int k){
        if(start_index == end_index)return this.nums[start_index];
        Random random_num = new Random();
        int pivot_index = start_index + random_num.nextInt(end_index - start_index);
        pivot_index = partition(start_index,end_index,pivot_index);
        if(k == pivot_index)return this.nums[k];
        else if(k < pivot_index)return quickselect(start_index,pivot_index - 1,k);
        else return quickselect(pivot_index + 1,end_index,k);
    }
    public int findKthLargest2(int[] nums, int k) {
        this.nums = nums;
        int size = nums.length;
        return quickselect(0,size - 1, size - k);
    }

}
