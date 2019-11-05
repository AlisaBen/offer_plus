package com.company.leetcode.week4.middle;

import com.company.jian_zhi_offer.base_package.ListNode;

/**
 * created by Arya on 2019/11/5 22:26
 * */
public class _19_removeNthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)return head;
        ListNode p = head,q = head;
        while (p.next != null){
            p = p.next;
            if(n != 0)n--;
            else q = q.next;
        }
        if(q == head && n > 0){
            return head.next;
        }
        if(q != null && q.next != null){
            q.next = q.next.next;
        }
        return head;
    }
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
        ListNode res = removeNthFromEnd(node1,1);
        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
