package com.company.jian_zhi_offer.link_list;

import com.company.jian_zhi_offer.base_package.RandomListNode;

/***
 *输入一个复杂链表（每个节点中有节点值，以及两个指针，
 * 一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */

public class C23_Clone {
    public static RandomListNode Clone(RandomListNode pHead) {
        if(pHead == null)return null;
        if(pHead.next == null){
            return pHead;
        }
        RandomListNode q = pHead;
        while (q != null){
//            System.out.println(q.label);
            RandomListNode tmp = new RandomListNode(q.label);
            tmp.next = q.next;
            q.next = tmp;
//            if(q.random != null) tmp.random = q.random.next;
            q = q.next.next;
        }
        q = pHead;
        while (q != null){
            if(q.random != null)q.next.random = q.random.next;
            q = q.next.next;
        }
        RandomListNode p = pHead.next;
        q = pHead.next;
        while (p != null && p.next != null){
            p.next = p.next.next;
            p = p.next;
        }
        return q;
    }

    public static void main(String[] args){
        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        RandomListNode node4 = new RandomListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node1.random = node4;
        node3.random = node2;
        RandomListNode res = Clone(node1);
        System.out.println("---");
        while (res != null){
            System.out.println("=====");
            System.out.println(res.label);
            if(res.random != null)System.out.println(res.random.label);
            res = res.next;
        }
    }

}
