package com.company.leetcode.week1.middle;

import com.company.jian_zhi_offer.base_package.ListNode;

import java.util.ArrayList;

/**
 * created by benyafang on 2019/10/14 20:49
 *
 * */
public class _142_detectCycle {
    public static ListNode detectCycle(ListNode head) {
        if(head == null)return null;
        if(head.next == null) return null;
        ListNode p = head.next;
        ListNode q = head;
        while (true){
            if(p.next == q)break;
            else{
                if(p.next != null && p.next.next != null){
                    q = q.next;
                    p = p.next.next;
                }else{
                    return null;
                }
            }
        }
        ArrayList<ListNode> tmp = new ArrayList<>();
        tmp.add(p);
        while (q != p){
            tmp.add(q);
            q = q.next;
        }
        while (head != null){
            System.out.println("=====" + head.val);
            for(ListNode t : tmp){
                System.out.println("-----" + t.val);
                if(head == t)return head;
//                else head = head.next;
            }
            head = head.next;
        }
        return null;
    }

    public static ListNode detectCycle1(ListNode head) {
        if(head == null)return null;
        if(head.next == null) return null;
        ListNode p = head.next;
        ListNode q = head;
        while (true){
            if(p.next == q)break;
            else{
                if(p.next != null && p.next.next != null){
                    q = q.next;
                    p = p.next.next;
                }else{
                    return null;
                }
            }
        }
        while (head != null){
//            System.out.println("=====" + head.val);
            while (q != p){
//                System.out.println("-----" + q.val);
                if(q == head)return head;
                q = q.next;
            }
//            if(head ==)
            if(head == q)return head;
            head = head.next;
            q = q.next;
        }
        return null;
    }

    public static void main(String[] args){
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node3.next = node2;
        node2.next = node0;
        node0.next = node4;
        node4.next = node0;
//        node2.next = node3;
        ListNode res = detectCycle1(node3);
        System.out.println(res.val);
    }
}
