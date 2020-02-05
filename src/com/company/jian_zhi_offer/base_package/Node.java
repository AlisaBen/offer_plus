package com.company.jian_zhi_offer.base_package;

public class Node {
    public int val;
    public Node next;
    public Node random;
    public boolean copy = false;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}