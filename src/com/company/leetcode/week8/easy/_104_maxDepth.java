package com.company.leetcode.week8.easy;

import com.company.jian_zhi_offer.base_package.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * created by Arya on 2019.12.13
 * */
public class _104_maxDepth {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int leftDepth = 0;
        int rightDepth = 0;
        if(root.left != null){
            leftDepth = maxDepth(root.left);
        }
        if(root.right != null){
            rightDepth = maxDepth(root.right);
        }
        return Math.max(leftDepth,rightDepth) + 1;

    }
}
