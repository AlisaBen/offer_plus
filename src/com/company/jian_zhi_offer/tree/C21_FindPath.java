package com.company.jian_zhi_offer.tree;

import com.company.jian_zhi_offer.base_package.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.TooManyListenersException;

/**
 * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 *
 *
 * 这个题目的意思并不是所有叶节点的和，而是树种所有节点的和，利用递归的思想，分别得到左子树和右子树的路径数组，最后加上根节点
 * (注意: 在返回值的list中，数组长度大的数组靠前)*/


public class C21_FindPath {
    private static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(root == null) return result;
        if(root.left == null && root.right == null && target == root.val){
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            tmp.add(root.val);
            result.add(tmp);
            return result;
        }
        ArrayList<ArrayList<Integer>> left = FindPath(root.left,target - root.val);
        ArrayList<ArrayList<Integer>> right = FindPath(root.right,target - root.val);
        left.addAll(right);
        left.forEach(t -> {
            t.add(0,root.val);
            result.add(t);
        });
        return result;
    }

    public static void main(String[] args){
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node4.left = node6;
        ArrayList res = FindPath(node1,8);
        System.out.println(res);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        ArrayList<Integer> tmp1 = new ArrayList<Integer>();
        tmp.add(3);
        tmp.add(4);
        tmp1.add(5);
        tmp.addAll(tmp1);
        System.out.println(tmp);
        System.out.println(tmp1);



    }
}
