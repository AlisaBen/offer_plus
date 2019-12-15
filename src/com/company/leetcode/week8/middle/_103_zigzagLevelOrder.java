package com.company.leetcode.week8.middle;

import com.company.jian_zhi_offer.base_package.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * created by Arya on 2019.12.13
 * 交替使用两个栈
 * */
public class _103_zigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Stack<TreeNode> left2right = new Stack<>();
        Stack<TreeNode> right2left = new Stack<>();
        List<Integer> index = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        if(root != null){
            List<Integer> tmp = new LinkedList<>();
            tmp.add(root.val);
            result.add(tmp);
            index.add(1);
            right2left.push(root.left);
            right2left.push(root.right);
            while (!left2right.isEmpty() || !right2left.isEmpty()){
                List<Integer> aa = new LinkedList<>();
                if(!right2left.isEmpty()){
                    while (!right2left.isEmpty()){
                        root = right2left.pop();
                        if(root != null){
                            aa.add(root.val);
                            left2right.push(root.right);
                            left2right.push(root.left);
                        }
                   }
                }else{
                    while (!left2right.isEmpty()){
                        root = left2right.pop();
                        if(root != null){
                            aa.add(root.val);
                            right2left.push(root.left);
                            right2left.push(root.right);
                        }

                    }
                }
                if(aa.size() != 0){
                    result.add(aa);
                }
            }
        }

        return result;
    }
}
