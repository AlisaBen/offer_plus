package com.company.jian_zhi_offer.link_list;

import com.company.jian_zhi_offer.base_package.ListNode;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * */
public class C13_Merge {
    public static ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null)return list2;
        if(list2 == null) return list1;
        ListNode p = list1;
        ListNode q = list2;
        ListNode res = new ListNode(0);
        ListNode res1 = res;
        while (p != null && q != null){
            if(p.val < q.val){
                res.next = p;
                p = p.next;
            }else{
                res.next = q;
                q = q.next;
            }
            res = res.next;
        }
        if(p != null)res.next = p;
        else res.next = q;
        return res1.next;
    }
    public static void main(String[] args){
        ListNode list1 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node5 = new ListNode(5);
        ListNode list2 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        ListNode node6 = new ListNode(6);
        list1.next = node3;
        node3.next = node5;

        list2.next = node4;
        node4.next = node6;
        ListNode res = Merge(list1,list2);
//        while (list1 != null){
//            System.out.println(list1.val);
//            list1 = list1.next;
//        }
//        System.out.println("----------------------");
//        while (list2 != null){
//            System.out.println(list2.val);
//            list2 = list2.next;
//        }
//        System.out.println("===========================");
        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }

    }
}
