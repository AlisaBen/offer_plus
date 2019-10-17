package com.company.leetcode.week1.easy;

/**
 * 1/10周
 * */
public class _27_removeElement {
    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int tail = len - 1;
        int i = 0;
        while (i < tail){
            if(nums[i] != val){
                i++;
            }else{
                nums[i] = nums[tail];
                tail --;
            }
        }
        if(i == tail &&nums[i] == val){
            return tail;
        }else return tail + 1;
    }
    public static void main(String[] args){
        int res = removeElement(new int[]{0,1,2,2,3,0,4,2},2);
        System.out.println(res);
    }
}
