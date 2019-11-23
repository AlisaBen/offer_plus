package com.company.leetcode.week5.easy;

/**
 * created by Arya on 2019.11.23 14:28
 * 合并两个有序数组
 * 方法一：从前向后，遍历数组1.2，数组1向后移动，可能移动多次
 * 方法二：从后向前，
 * */
public class _88_merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for(int i = 0;i < nums2.length;i++){
            while (nums1[j] <= nums2[i])j++;
            for(int k = m;k > j;k--){
                nums1[k] = nums1[k-1];
            }
            nums1[j] = nums2[i];
            m++;
        }
    }
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int i = m - 1,j = n - 1;
        while (i >= 0 && j >= 0){
            if(nums1[i] >= nums2[j])nums1[index--] = nums1[i--];
            else nums1[index--] = nums2[j--];
        }
        while (i >= 0){
            nums1[index--] = nums1[i--];
        }
        while (j >= 0)nums1[index--] = nums2[j--];
    }
}
