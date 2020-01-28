package com.company.leetcode.week8.middle;

import com.company.jian_zhi_offer.base_package.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * created by Arya on 2019/12/13
 * 方法一：递归
 * 方法二：栈，未满足条件的暂时入栈
 * */
public class _94_inorderTraversal {
//    private List<Integer> result = new ListnkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new LinkedList<>();
        List<Integer> left = new LinkedList<>();
        List<Integer> right = new LinkedList<>();
        if(root.left != null){
            left = inorderTraversal(root.left);
        }
        if(root.right != null){
            right = inorderTraversal(root.right);
        }
        left.add(root.val);
        left.addAll(right);
        return left;

    }

    public List<Integer> inorderTraversal1(TreeNode root) {
        Stack<TreeNode> tmp = new Stack<>();
        List<Integer> result = new LinkedList<>();
        while (root != null || !tmp.isEmpty()){
            while (root != null){
                tmp.push(root);
                root = root.left;
            }
            TreeNode node = tmp.pop();
            result.add(node.val);
            root = node.right;
        }
        return result;
    }
}
