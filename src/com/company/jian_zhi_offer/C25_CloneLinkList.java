package com.company.jian_zhi_offer;
import com.company.jian_zhi_offer.base_package.RandomListNode;
import com.company.jian_zhi_offer.base_package.Node;
/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class C25_CloneLinkList {
    // 牛客网的代码
    public static RandomListNode Clone(RandomListNode head)
    {
        if(head == null){
            return head;
        }
        // 空间复杂度O(1)，将克隆结点放在原结点后面
        RandomListNode node = head;
        // 1->2->3  ==>  1->1'->2->2'->3->3'
        while(node != null){
            RandomListNode clone = new RandomListNode(node.label);
            RandomListNode temp = node.next;
            clone.next = temp;
            node.next = clone;
            node = temp;
        }
        // 处理random指针
        node = head;
        while(node != null){
            // ！！
            node.next.random = node.random == null ? null : node.random.next;
            node = node.next.next;
        }
        // 还原原始链表，即分离原链表和克隆链表
        node = head;
        RandomListNode cloneHead = head.next;
        while(node.next != null){
            RandomListNode temp = node.next;
            node.next = node.next.next;
            node = temp;
        }
        return cloneHead;


        
    }

    // leetcode的提交代码，击败100% ，尤其需要注意，在原来的链表修改后需要回复原来的链表
    public static Node copyRandomList(Node head) {
        if (head == null) return null;
        Node p = head;
        while (p != null) {
            Node clone = new Node(p.val);
            // clone.copy = true;
            Node next = p.next;
            clone.next = next;
            p.next = clone;
            p = next;
        }
        p = head;
        while (p != null) {
            if (p.random != null) {
                p.next.random = p.random.next;
            }
            p = p.next.next;
        }
        Node p_old = head;
        Node p_new = head.next;
        Node p_new_ptr = head.next;
        while(p_new_ptr != null) {
            p_old.next = p_new_ptr.next;
            p_old = p_old.next;
            p_new_ptr.next = p_new_ptr.next == null ? null : p_new_ptr.next.next;
            p_new_ptr = p_new_ptr.next;
        }

        return p_new;     
    }


    public static void main(String[] args) {
        // RandomListNode node1 = new RandomListNode(1);
        // RandomListNode node2 = new RandomListNode(2);
        // RandomListNode node3 = new RandomListNode(3);
        // node1.next = node2;
        // node2.random = node3;
        // node2.next = node3;
        // node1.random = node3;
        // RandomListNode res = Clone(node1);
        // // RandomListNode res = Clone1(node1);
        // while(res != null) {
        //     System.out.println("label:"+res.label + " cpoy:" + res.copy);
        //     if (res.random != null) {
        //         System.out.println("random label:"+res.random.label);
        //     }
        //     res = res.next;
        // }

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        n1.random = n3;
        Node res = copyRandomList(n1);
        while(res != null) {
            System.out.println("label:"+res.val + " cpoy:" + res.copy);
            if (res.random != null) {
                System.out.println("random label:"+res.random.val);
            }
            res = res.next;
        }
        
    }
}
