package com.company.jian_zhi_offer;
import com.company.jian_zhi_offer.base_package.*;


/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class C58_GetNext {
    public static TreeLinkNode middle(TreeLinkNode pNode) {
        if (pNode == null) return null;
        TreeLinkNode left = middle(pNode.left);
        return left == null ? pNode : left;
    }
    // 如果有右节点，就是右节点的最左边节点，否则，找父节点的父节点，知道是左孩子
    public static TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if (pNode == null) return null; // 根节点并且右节点为空
        if (pNode.right != null) return middle(pNode.right);
        // 没有右节点
        TreeLinkNode parent = pNode.next; // 父节点
        TreeLinkNode current = pNode; // 遍历的当前节点
        while (parent != null) {
            if (parent.left == current) return parent;
            current = parent;
            parent = parent.next;
        }
        return null;
    }
    public static void main(String[] args) {
        TreeLinkNode node1 = new TreeLinkNode(1);
        TreeLinkNode node2 = new TreeLinkNode(2);
        TreeLinkNode node3 = new TreeLinkNode(3);
        node2.right = node3;
        node3.next = node2;
        node1.right = node2;
        node2.next = node1;
        TreeLinkNode node4 = new TreeLinkNode(4);
        TreeLinkNode node5 = new TreeLinkNode(5);
        node1.left = node4;
        node4.next = node1;
        node4.right = node5;
        node5.next = node4;
        TreeLinkNode r = GetNext(node5);
        if (r != null) {
            System.out.println(r.val);
        }
        

    }
}