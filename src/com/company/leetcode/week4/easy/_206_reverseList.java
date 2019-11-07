package com.company.leetcode.week4.easy;

import com.company.jian_zhi_offer.base_package.ListNode;

/**
 * created by Arya on 2019/11/7 23:01
 * 翻转一个单链表
 * 递归或者迭代。
 * 递归待做
 * */
public class _206_reverseList {
    public static ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode fire = new ListNode(-1);
        fire.next = head;
        ListNode curr = head;
        ListNode preV = fire;
        ListNode third;
        while (curr != null){
            third = curr.next;
            curr.next = preV;
            preV = curr;
            curr = third;
        }
        head.next = null;
        return preV;

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
        ListNode result = reverseList(null);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }


    }
}
