package com.company.leetcode.week4.easy;

import com.company.jian_zhi_offer.base_package.ListNode;

import java.util.List;

/**
 * created by Arya on 2019/11/7 22:52
 * 移除链表指定元素
 *
 * */
public class _203_removeElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode fire = new ListNode(-1);
        fire.next = head;
        ListNode p = fire;
        while (p.next != null){
            if(p.next.val != val){
                p = p.next;
                continue;
            }
            p.next = p.next.next;
        }
        return fire.next;
    }
    public static void main(String[]args){
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
        ListNode result = removeElements(node1,2);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }

    }

}
