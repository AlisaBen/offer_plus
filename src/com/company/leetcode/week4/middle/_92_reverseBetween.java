package com.company.leetcode.week4.middle;

import com.company.jian_zhi_offer.base_package.ListNode;

import java.util.ArrayList;

/**
 * created by Arya on 2019/11/7 20:54
 * 翻转链表m到n的位置
 * 1. 数组存储链表m-n的指针，调换节点对应的值，需要开辟O（n）的数组空间，需要两次遍历
 * 2. 指针con指向前端最末尾节点，tail指向被翻转部分的最后一个节点，curr指向后半段节点的第一个几点，preV指向被翻转的第一个节点
 * 借助O（1）空间暂存curr.next
 * 1）third = curr.next;
 * 2) curr.next = preV;
 * 3) preV = curr;
 * 4) curr = third;
 * */
public class _92_reverseBetween {
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if(m > n)throw new IllegalArgumentException("参数非法");
        if(m == n || head == null || head.next == null)return head;
        ArrayList<ListNode> tmp = new ArrayList<>(n - m + 1);
        ListNode p = head;
        int num = 1;
        while (p != null){
            if(num > n)break;
            if(num >= m && num <= n){
                tmp.add(p);
            }
            num++;
            p = p.next;
        }
        for(int i = 0;i < tmp.size() / 2;i++){
            int v = tmp.get(i).val;
            tmp.get(i).val = tmp.get(tmp.size() - i - 1).val;
            tmp.get(tmp.size() - i - 1).val = v;
        }
        return head;
    }
    public static ListNode reverseBetween1(ListNode head, int m, int n) {
        if(m > n)throw new IllegalArgumentException("参数非法");
        if(m == n || head == null || head.next == null)return head;
        ListNode preV = null;
        ListNode curr = head;
        ListNode con = null;
        ListNode tail = head;
        int num = 1;
        while (num < m){
            num ++;
            if(preV == null)preV = head;
            else preV = preV.next;
            if(con == null) con = head;
            else con = con.next;
            curr = curr.next;
            tail = tail.next;
        }
        while (num <= n){
            num ++;
            ListNode third = curr.next;
            curr.next = preV;
            preV = curr;
            curr = third;
        }

        tail.next = curr;
        if(con != null){
            con.next = preV;
//            return con;
        }else head = preV;
        return head;
    }
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node2_1 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node4_1 = new ListNode(4);
//        node1.next = node2;
//        node2.next = node2_1;
//        node2_1.next = node3;
//        node3.next = node4;
//        node4.next = node4_1;

        node1.next = node2;
        ListNode result = reverseBetween1(node1,1,2);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

}

