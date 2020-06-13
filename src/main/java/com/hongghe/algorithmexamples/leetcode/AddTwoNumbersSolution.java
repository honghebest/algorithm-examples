package com.hongghe.algorithmexamples.leetcode;

import org.checkerframework.checker.units.qual.A;

/**
 * @author honghe zhang
 * @date 2020/05/31
 */
public class AddTwoNumbersSolution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int nodeOne = 0;
        int nodeTwo = 0;
        while (l1.next != null) {
            nodeOne = nodeOne + l1.val*10;
            l1 = l1.next;
        }
        nodeOne = nodeOne + l1.val*10;

        System.out.println(nodeOne);
        while (l2.next != null) {
            nodeTwo = nodeTwo + l2.val*10;
            l2 = l2.next;
        }
        nodeTwo = nodeTwo + l2.val*10;

        System.out.println(nodeTwo);
        int result = nodeOne + nodeTwo;
        ListNode resultNode = new ListNode(result%10);
        result = result/10;
        while (result > 0) {
            ListNode next = new ListNode(result%10);
            resultNode.next = next;
            result = result/10;
        }
        return resultNode;
    }

    public static void main(String[] args) {
        AddTwoNumbersSolution addTwoNumbersSolution = new AddTwoNumbersSolution();
    }
}
