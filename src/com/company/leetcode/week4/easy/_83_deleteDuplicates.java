package com.company.leetcode.week4.easy;

import com.company.jian_zhi_offer.base_package.ListNode;

/**
 * created by Arya on 2019/11/7 20:37
 * 删除排序链表中的重复元素
 * 1. 发现不同元素，将p的next指向该节点，最后q节点next置空
 * 2. 发现不同元素，q节点后移一位，修改val为p节点的val，最后q节点的next置空
 * */
public class _83_deleteDuplicates {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode p = head.next;
        ListNode q = head;
        while (p != null){
            if(q.val != p.val){
                q.next = p;
                q = p;
            }
            p = p.next;
        }
        q.next = null;
        return head;
    }
    public static ListNode deleteDuplicates1(ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode p = head.next;
        ListNode q = head;
        while (p != null){
            if(q.val != p.val){
                q = q.next;
                q.val = p.val;
            }
            p = p.next;
        }
        q.next = null;
        return head;
    }
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node2_1 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node4_1 = new ListNode(4);
        node1.next = node2;
        node2.next = node2_1;
        node2_1.next = node3;
        node3.next = node4;
        node4.next = node4_1;
        ListNode result = deleteDuplicates1(node1);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

}
