package com.company.leetcode.week4.easy;

import com.company.jian_zhi_offer.base_package.ListNode;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * created by Arya on 2019/11/7 23:15
 * 删除链表中的节点
 * 只给定链表中要删除的节点，并不知道这个节点的前面的节点。值覆盖
 *
 *
 * */
public class _237_deleteNode {
    public static void deleteNode(ListNode node) {
//        ListNode curr = node;
        ListNode pre = node;
        while (node != null && node.next != null){
            pre = node;
            node.val = node.next.val;
            node = node.next;
        }
        pre.next = null;
//        while (curr!=null){
//            System.out.println(curr.val);
//            curr = curr.next;
//        }
    }
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node2_1 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node4_1 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        deleteNode(node3);
    }
}
