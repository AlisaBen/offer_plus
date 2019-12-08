package com.company.leetcode.week7.middle;

import com.company.jian_zhi_offer.base_package.ListNode;

import java.util.List;

/**
 * created by Arya on 2019.12.8 14:17
 * 分隔链表
 * */
public class _86_partition {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null)return head;
        ListNode tt = new ListNode(0);
        tt.next = head;
        ListNode pre = tt;
        ListNode p = tt.next;
        ListNode tmp = new ListNode(0);
        ListNode tail = tmp;
        while (p != null){
            if(p.val >= x){
                pre.next = p.next;
                tail.next = p;
                tail = tail.next;
                p = pre.next;
            }else{
                pre = pre.next;
                p = p.next;
            }
        }
        tail.next = null;
        pre.next = tmp.next;
        return tt.next;

    }
}
