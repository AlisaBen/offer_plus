package com.company.leetcode.week4.middle;

import com.company.jian_zhi_offer.base_package.ListNode;

/**
 * created by Arya on 2019/11/7 22:08
 * 对链表进行插入排序
 * 1. 29ms
 * 2. 4ms
 * */
public class _147_insertionSortList {
    public static ListNode insertionSortList(ListNode head) {
        if(head == null)return head;
        ListNode preV = null;
        ListNode curr = head;
        while (curr != null){
            ListNode third = curr.next;
            if(preV == null){
                curr.next = preV;
                preV = curr;
            }else{
                if(preV.val >= curr.val){//preV值大于等于curr.val
                    curr.next = preV;
                    preV = curr;
                }else{//preV.val小于curr.val
                    ListNode p = preV;
                    while (p.next != null && p.next.val < curr.val){
                        p = p.next;
                    }
                    curr.next = p.next;
                    p.next = curr;
                }
            }
            curr = third;
        }
        return preV;
    }
    public static ListNode insertionSortList1(ListNode head) {
        ListNode fire = new ListNode(-1);
        fire.next = head;
        while (head != null && head.next != null){
            if(head.val <= head.next.val){
                head = head.next;
                continue;
            }
            ListNode curr = head.next;
            head.next = curr.next;
            ListNode pre = fire;
            while (pre.next.val < curr.val){
                pre = pre.next;
            }
            curr.next = pre.next;
            pre.next = curr;
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
        node1.next = node3;
        node3.next = node2;
        node2.next = node4;
        node4.next = node2_1;
        ListNode result = insertionSortList1(node1);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
