package com.hongghe.algorithmexamples.leetcode;

import com.hongghe.algorithmexamples.leetcode.domain.ListNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: hongghe @date: 2019-02-21 10:09
 */
public class TwoNumSumSolution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list = new LinkedList<>();
        while (l1.next != null) {
            ((LinkedList<Integer>) list).push(l1.val + l2.val);
            l1 = l2.next;
            l2 = l2.next;
        }

        ((LinkedList<Integer>) list).push(l1.val + l2.val);
        System.out.println(list.size());
        ListNode listNode = new ListNode(0);
        for (int i=list.size(); i>0; i--) {
            System.out.println(i);
            System.out.println(list.get(i-1));
            listNode.val = list.get(i-1);
            listNode = listNode.next;
        }
        return listNode;
    }
}
