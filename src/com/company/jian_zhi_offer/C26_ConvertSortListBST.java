package com.company.jian_zhi_offer;
import com.company.jian_zhi_offer.base_package.*;
class C26_ConvertSortedListBST {
    // leetcode代码
    public TreeNode sortedListToBST(ListNode head) {
        return null;
        
    }

    // 牛客网代码
    public static TreeNode findListNode(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return pRootOfTree;
        while(pRootOfTree != null && pRootOfTree.right != null) {
            pRootOfTree = pRootOfTree.right;
        }
        return pRootOfTree;
    }
    public static TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return pRootOfTree;
        TreeNode left = Convert(pRootOfTree.left);
        TreeNode lastNode4Left = findListNode(left);
        if (lastNode4Left != null)lastNode4Left.right = pRootOfTree;
        pRootOfTree.left = lastNode4Left;
        TreeNode right = Convert(pRootOfTree.right);
        pRootOfTree.right = right;
        if (right != null) right.left = pRootOfTree;
        return left == null ? pRootOfTree : left;
    }

    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7);
        TreeNode node5 = new TreeNode(5);
        TreeNode node9 = new TreeNode(9);
        node7.left = node5;
        node7.right = node9;
        TreeNode s = Convert(node7);
        while(s!= null){
            System.out.println("left" + (s.left == null ? "null" : s.left.val) + " val:" + s.val);
            s = s.right;
        }
    }
}