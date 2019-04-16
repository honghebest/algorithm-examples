package com.hongghe.algorithmexamples.leetcode;

import com.hongghe.algorithmexamples.leetcode.domain.ListNode;

/**
 * <p>输入一个链表，输出该链表中倒数第k个结点</p>
 *
 * @author: hongghe @date: 2019-03-24 16:36
 */
public class LinkNoK {

    public ListNode findX(ListNode head, int k) {
        ListNode pre = null, p = null;
        p = head;
        pre = head;
        int a = k;
        int count = 0;
        while (p!=null) {
            p = p.next;
            count ++;
            if (k < 1) {
                pre = pre.next;
            }
            k--;
        }
        if (count < a) return null;
        return pre;
    }
}
