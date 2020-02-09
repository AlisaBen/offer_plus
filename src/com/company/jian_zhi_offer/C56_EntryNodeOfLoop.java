package com.company.jian_zhi_offer;

import com.company.jian_zhi_offer.base_package.*;
/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class C56_EntryNodeOfLoop {
    public ListNode getIntersect(ListNode pHead) {
        // 返回相遇节点
        if (pHead == null) return pHead;
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (fast !=  null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return fast;
        }
        return null;
    }

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode intersect = getIntersect(pHead);
        if (intersect == null) return null;
        ListNode ptr = pHead;
        while (intersect != ptr) {
            intersect = intersect.next;
            ptr = ptr.next;
        }
        return intersect;
    }
}