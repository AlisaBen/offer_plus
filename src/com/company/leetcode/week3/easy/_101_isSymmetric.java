package com.company.leetcode.week3.easy;

import com.company.jian_zhi_offer.base_package.TreeNode;

public class _101_isSymmetric {
    public boolean isSimilar(TreeNode p,TreeNode q){
        if(p.val == q.val){
            boolean f1,f2;
            if(p.left == null && q.right == null)f1 = true;
            else if(p.left != null && q.right != null){
                f1 = isSimilar(p.left,q.right);
            }else f1 = false;
            if(p.right == null && q.left == null)f2 = true;
            else if(p.right != null && q.left != null){
                f2 = isSimilar(p.right,q.left);
            }else f2 = false;
            return f1 && f2;
        }else{
            return false;
        }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null || root.left == null && root.right == null)return true;
        if(root.left != null && root.right != null){
            return isSimilar(root.left,root.right);
        }
        return false;
    }
}
