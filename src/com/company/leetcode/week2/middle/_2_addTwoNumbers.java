package com.company.leetcode.week2.middle;

import com.company.jian_zhi_offer.base_package.ListNode;

public class _2_addTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode p = l1,q = l2;
        ListNode result = new ListNode(l1.val + l2.val);
        ListNode p = result;
        Boolean forward = false;
        if(result.val > 9){
            result.val -= 10;
            forward = true;
        }
        l1 = l1.next;l2 = l2.next;
        while (l1 != null && l2 != null){
            if(forward){
                if(l1.val + l2.val + 1 >= 10){
                    p.next = new ListNode(l1.val + l2.val + 1 - 10);
                    forward = true;
                }else{
                    p.next = new ListNode(l1.val + l2.val + 1);
                    forward = false;
                }
            }else{
                if(l1.val + l2.val >= 10){
                    p.next = new ListNode(l1.val + l2.val - 10);
                    forward = true;
                }else{
                    p.next = new ListNode(l1.val + l2.val);
                    forward = false;
                }
            }
            l1 = l1.next;l2 = l2.next;p = p.next;

        }
        while (l1 != null){
            if(forward){
                if(l1.val + 1 >= 10){
                    l1.val = l1.val + 1 - 10;
                    forward = true;
                }else{
                    l1.val += 1;
                    forward = false;
                }
            }
            p.next = l1;
            l1 = l1.next;p = p.next;
        }
        while (l2 != null){
            if(forward){
                if(l2.val + 1 >= 10){
                    l2.val = l2.val + 1 - 10;
                    forward = true;
                }else{
                    l2.val += 1;
                    forward = false;
                }
            }
            p.next = l2;
            l2 = l2.next;p = p.next;
        }
        if(forward){
            p.next = new ListNode(1);
        }
        return result;
    }
    public static void main(String[] args){
        ListNode node7 = new ListNode(7);
        ListNode node3 = new ListNode(5);
        ListNode node1 = new ListNode(1);
        ListNode node4 = new ListNode(4);
        ListNode node9 = new ListNode(9);
        ListNode node8 = new ListNode(8);
        node7.next = node1;
        node1.next = node4;
        node9.next = node8;
        ListNode result = addTwoNumbers(node3,node3);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
