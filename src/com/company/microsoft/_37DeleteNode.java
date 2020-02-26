package com.company.microsoft;
import com.company.jian_zhi_offer.base_package.*;

/**
 * o(1)时间删除链表节点
 */
class _37DeleteNode{
    public static ListNode deleteNode(ListNode head, ListNode deleteNode) {
        if (deleteNode == null) return head;
        if (deleteNode.next == null) {
            if (head == deleteNode) return null;
            ListNode p = head;
            while(p.next != deleteNode) {
                p = p.next;
            }
            p.next = null;
            return head;
        }
        deleteNode.val = deleteNode.next.val;
        deleteNode.next = deleteNode.next.next;
        return head;
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        ListNode res = deleteNode(node1, node3);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}