package com.company.leetcode;

import com.company.jian_zhi_offer.base_package.ListNode;

import java.util.ArrayList;

/**
 * created by benyafang on 2019/10/14 19:40
 * 待优化108ms
 * */
public class _141_hasCycle {
    public static boolean hasCycle(ListNode head) {
        ArrayList<ListNode> duplicate = new ArrayList<ListNode>();
        while (head != null){
            for(ListNode tmp:duplicate){
                if(head == tmp){
                    return true;
                }
            }
            duplicate.add(head);
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args){
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

//        node3.next = node2;
//        node2.next = node0;
//        node0.next = node4;
//        node4.next = node2;
        node2.next = node3;
        Boolean res = hasCycle(node3);
        System.out.println(res);
    }
}
