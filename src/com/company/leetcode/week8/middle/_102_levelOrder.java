package com.company.leetcode.week8.middle;

import com.company.jian_zhi_offer.base_package.ListNode;
import com.company.jian_zhi_offer.base_package.TreeNode;

import java.util.*;

/**
 * created by Arya on 2019.12.13
 * 这里用到了队列，并且需要注意LinkedList的push方法实际上调用的是addFirst方法，会添加到第一位
 * */
public class _102_levelOrder {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> tmp = new LinkedList<>();
        List<Integer> index = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
//        Integer index = 1;
        if (root != null){
            ((LinkedList<TreeNode>) tmp).add(root);
            index.add(1);
            while (!tmp.isEmpty()){
                root = ((LinkedList<TreeNode>) tmp).remove();
                Integer idx = index.remove(0);
                if(root != null){
                    System.out.println(root.val);
                    ((LinkedList<TreeNode>) tmp).add(root.left);
                    ((LinkedList<TreeNode>) tmp).add(root.right);
                    index.add(idx + 1);
                    index.add(idx + 1);
                    if(result.size() == idx){//说明该数据的列表存在
                        System.out.println(idx + "new");
                        List<Integer> last = ((LinkedList<List<Integer>>) result).getLast();
                        last.add(root.val);
                        result.remove(result.size() - 1);
                        result.add(last);
                        System.out.println(result);
                    }else{
                        System.out.println(idx + "index");
                        List<Integer> aa = new LinkedList<>();
                        ((LinkedList<Integer>) aa).push(root.val);
                        result.add(aa);
//                        ((LinkedList<LinkedList<Integer>>) result).push(aa);
                        System.out.println(result);
                    }
                }

            }
        }
        return result;

    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        root.left = node2;
        List<List<Integer>> result = levelOrder(root);
        System.out.println(result);
    }
}
