package com.company.jian_zhi_offer.link_list;

import com.company.jian_zhi_offer.base_package.ListNode;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * */
public class C11_FindKthToTail {
    public static ListNode FindKthToTail(ListNode head, int k) {
        int len = 0;
        ListNode tail = head;
        while (head != null && len < k){
            len ++;
            head = head.next;
        }
        if(len < k)return null;
        while (head != null){
            tail = tail.next;
            head = head.next;
        }
        return tail;
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
        ListNode res = FindKthToTail(node1,10);
        if(res != null){
            System.out.println(res.val);
        }else{
            System.out.println("==");

        }

    }
}
