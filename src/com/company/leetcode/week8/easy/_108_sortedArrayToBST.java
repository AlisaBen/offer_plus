package com.company.leetcode.week8.easy;

import com.company.jian_zhi_offer.base_package.TreeNode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * created by Arya on 2019.12.13
 * */
public class _108_sortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)return null;
        int size = nums.length;
        TreeNode root = new TreeNode(nums[size / 2]);
        TreeNode left = sortedArrayToBST(Arrays.copyOfRange(nums,0,size / 2));
        TreeNode right = sortedArrayToBST(Arrays.copyOfRange(nums,size / 2 + 1, size));
        root.left = left;
        root.right = right;
        return root;

    }
}
