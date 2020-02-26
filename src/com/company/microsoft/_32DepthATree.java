package com.company.microsoft;

import com.company.jian_zhi_offer.base_package.TreeNode;

/***
 * 输入一棵二元树的根结点，求该树的深度。
 */
class _32DepthATree{
    public static int depth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        int depth = depth(node1);
        System.out.println(depth);
    }

}