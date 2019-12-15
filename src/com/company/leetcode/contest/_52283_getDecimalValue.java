package com.company.leetcode.contest;

import com.company.jian_zhi_offer.base_package.ListNode;

/**
 * 二进制链表转整数
 * */
public class _52283_getDecimalValue {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        while (head!=null){
            result = result * 2 + head.val;
            head = head.next;
        }
        return result;

    }
}
