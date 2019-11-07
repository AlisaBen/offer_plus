package com.company.leetcode.week4.middle;

import com.company.jian_zhi_offer.base_package.ListNode;

/**
 * created by Arya on 2019/11/7 20:16
 * 旋转链表
 * 将每个节点向右移动k个位置
 * */
public class _61_rotateRight {
    public static ListNode rotateRight(ListNode head, int k) {
        if(k < 0) throw new IllegalArgumentException("k非法");
        if(k == 0)return head;//k=0时直接返回
        if(head == null || head.next == null)return head;
        int len = 1;
        ListNode p = head;
        while (p.next != null){
            len ++;
            p = p.next;
        }
        int move_num = k % len;//最终移动的距离是k对长度取余
        if(move_num == 0)return head;//不需要移动
        //结束循环的时候p指向尾结点
        ListNode tail_node = p;//定位尾结点，移动链表的时候挂在后面
        p = head;
        int n = 1;//从第一个节点开始遍历
        int stop_num = len - move_num;
        while (n < stop_num && p.next != null){
            n++;
            p = p.next;
        }
        ListNode result;
        if(p.next != null){
            result = p.next;
            p.next = null;
            tail_node.next = head;
            return result;
        }
        System.out.println("wrong");
        return null;
    }
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode result = rotateRight(node1,5);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
