package com.company.jian_zhi_offer;

import com.company.jian_zhi_offer.base_package.*;
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class C59_isSymmetrical {
    static TreeNode reverse(TreeNode root) {
        if (root == null || root.left == null && root.right == null)return root;
        TreeNode left = reverse(root.left);
        TreeNode right = reverse(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
    static boolean isEqual(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 != null && root2 != null && root1.val == root2.val) {
            boolean left = isEqual(root1.left, root2.left);
            boolean right = isEqual(root1.right, root2.right);
            return left && right;
        }
        return false;
    }
    static boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot == null || pRoot.left == null && pRoot.right == null) return true;
        if (pRoot.left != null && pRoot.right != null) {
            TreeNode right1 = reverse(pRoot.right);
            return isEqual(pRoot.left, right1);

        }
        return false;
        
    }
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node22 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node33 = new TreeNode(3);
        node1.left = node2;
        node1.right = node22;
        node2.left = node3;
        node22.right = node33;
        
        boolean a = isSymmetrical(node1);
        System.out.println(a);
    }
}