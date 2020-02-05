package com.company.jian_zhi_offer;

import com.company.jian_zhi_offer.base_package.*;
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class C36_FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null)return null;
        ListNode p = pHead1;
        ListNode q = pHead2;
        while (p != q) {
            if (p == null)p = pHead2;
            else p = p.next;
            if (q == null)q = pHead1;
            else q = q.next;
        }
        return p;
    }
}
