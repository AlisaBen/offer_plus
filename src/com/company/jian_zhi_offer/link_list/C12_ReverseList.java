package com.company.jian_zhi_offer.link_list;

import com.company.jian_zhi_offer.base_package.ListNode;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 * */
public class C12_ReverseList {
    public static ListNode ReverseList(ListNode head) {
        if(head == null) return null;
        if(head.next == null)return head;
        if(head.next.next == null){
            ListNode p = head.next;
            p.next = head;
            head.next = null;
            return p;
        }

        ListNode h = head.next.next;
        ListNode p = head.next;
        ListNode q = head;
        q.next = null;
        while (h.next != null){
            p.next = q;
            q = p;
            p = h;
            h = h.next;
        }
        p.next = q;
        h.next = p;
        return h;
    }
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node5 = new ListNode(5);
        ListNode node2 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        ListNode node6 = new ListNode(6);
        node1.next = node5;
        node5.next = node3;
        node3.next = node2;
        node2.next = node6;
        ListNode res = ReverseList(node1);
        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }

    }
}
