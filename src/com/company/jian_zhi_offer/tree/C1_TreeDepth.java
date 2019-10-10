package com.company.jian_zhi_offer.tree;

import com.company.jian_zhi_offer.base_package.TreeNode;

public class C1_TreeDepth {
    public int TreeDepth(TreeNode root) {
        if(root == null) return 0;
        int leftDepth = 0;
        int rightDepth = 0;
        if(root.left != null){
            leftDepth = TreeDepth(root.left);
        }
        if(root.right != null){
            rightDepth = TreeDepth(root.right);
        }
        return Math.max(leftDepth,rightDepth) + 1;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        TreeNode left_node = new TreeNode(5);
        root.left = left_node;
        TreeNode left1 = new TreeNode(10);
        left_node.left = left1;

        System.out.println(new C1_TreeDepth().TreeDepth(root));

    }
}