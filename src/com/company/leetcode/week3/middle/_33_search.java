package com.company.leetcode.week3.middle;

/**
 * created by benyafang on 2019/10/29 8；25
 * */
public class _33_search {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int middle = (left + right) / 2;
            if(nums[middle] == target) return middle;
            if(nums[middle] >= nums[left]){
                if(target < nums[middle] && target >= nums[left]){
                    right = middle - 1;
                }else{
                    left = middle + 1;
                }
            }else{
                if(target > nums[middle] && target <= nums[right]){
                    left = middle + 1;
                }else{
                    right = middle - 1;
                }
            }
        }
        return -1;

    }
    public static void main(String[] args){
        int [] nums = {3};
        int result = search(nums,5);
        System.out.println(result);
    }
}
