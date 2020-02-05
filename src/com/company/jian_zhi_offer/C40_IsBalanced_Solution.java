package com.company.jian_zhi_offer;

import com.company.jian_zhi_offer.base_package.*;
public class C40_IsBalanced_Solution {
    public static int depth(TreeNode root) {
        if (root == null) return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        return Math.max(left, right) + 1;
    }
    public static boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) return true;
        boolean left = IsBalanced_Solution(root.left);
        boolean right = IsBalanced_Solution(root.right);
        if (left && right) {
            int left_depth = depth(root.left);
            int right_depth = depth(root.right);
            if (Math.abs(left_depth - right_depth) <= 1) return true;
            else return false;
        } else return false;
        // return left && right ? 
        
    }
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        // node1.left = node2;
        // node1.right = node3;
        // node2.right = node4;

        node1.left = node2;
        node2.right = node3;
        boolean s = IsBalanced_Solution(node1);
        System.out.println(s);
    }
}