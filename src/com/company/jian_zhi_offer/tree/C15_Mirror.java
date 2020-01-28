package com.company.jian_zhi_offer.tree;

import com.company.jian_zhi_offer.base_package.TreeNode;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 二叉树访问的时候注意判断null，放置指针错误
 * */
public class C15_Mirror {
    public static void PrintTree(TreeNode root){
        if(root.left != null)PrintTree(root.left);
        System.out.println(root.val);
        if(root.right != null)PrintTree(root.right);
    }
    public static void Mirror(TreeNode root) {
        if(root == null || root.left ==null && root.right == null) return;
//        TreeNode tmp = null;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        if(root.left != null){
            if(root.left.left != null || root.left.right != null){
                Mirror(root.left);
            }
        }
        if(root.right != null){
            if(root.right.left != null || root.right.right != null){
                Mirror(root.right);
            }
        }

    }
     public static void main(String[] args){
        TreeNode root = new TreeNode(10);
        TreeNode node7 = new TreeNode(7);
        TreeNode node6 = new TreeNode(6);
        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node8 = new TreeNode(8);
        node8.left = node7;
        node7.left = node6;
        node6.left = node5;
        node5.left = node4;
        PrintTree(node8);
        System.out.println("---------------");
//        root.left = node7;
//        root.right = node6;
//        node7.left = node5;
//        node7.right = node4;
//        node6.left = node2;
//        node6.right = node1;
//        TreeNode res = Mirror(node8);
//        PrintTree(res);
     }
}
