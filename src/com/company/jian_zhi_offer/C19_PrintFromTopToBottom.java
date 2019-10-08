package com.company.jian_zhi_offer;

import com.company.jian_zhi_offer.base_package.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * */
public class C19_PrintFromTopToBottom {
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null)return res;
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode t = queue.poll();
            res.add(t.val);
            if(t.left!=null)queue.offer(t.left);
            if(t.right != null)queue.offer(t.right);
        }

        return res;
    }
    public static void main(String[] args){
//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(3);
//        queue.offer(5);
//        queue.add(45);
//        System.out.println(queue.peek());//打印第一个元素，但是不出队
//        System.out.println(queue);
//        System.out.println(queue.poll());//打印第一个元素，出队
//        System.out.println(queue);
//        System.out.println(queue.remove());//打印第一个元素，出队
//        System.out.println(queue);

        TreeNode root = new TreeNode(10);
        TreeNode node7 = new TreeNode(7);
        TreeNode node6 = new TreeNode(6);
        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node8 = new TreeNode(8);
//        node8.left = node7;
//        node7.left = node6;
//        node6.left = node5;
//        node5.left = node4;
//        ArrayList res = PrintFromTopToBottom(node8);
//        System.out.println("---------------");
//        System.out.println(res);
        root.left = node7;
        root.right = node6;
        node7.left = node5;
        node7.right = node4;
        node6.left = node2;
        node6.right = node1;
        ArrayList res = PrintFromTopToBottom(root);
        System.out.println("---------------");
        System.out.println(res);
    }
}
