package com.company.leetcode.week3.easy;

import com.company.jian_zhi_offer.base_package.TreeNode;

/**
 * created by benyafang on 2019/10/29 20:18
 * */
public class _100_isSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)return true;
        if(p == null || q == null)return false;
        if(p.val == q.val){
            boolean left,right;
            if(p.left != null && q.left != null)left = isSameTree(p.left,q.left);
            else if(p.left == null && q.left == null)left = true;
            else left = false;
            if(p.right != null && q.right != null)right = isSameTree(p.right,q.right);
            else if(p.right == null && q.right == null)right = true;
            else right = false;
            return left && right;
        }else return false;
    }
    public static void main(String[] args){
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);

    }
}
