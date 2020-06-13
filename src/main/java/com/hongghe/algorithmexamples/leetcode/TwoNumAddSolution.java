package com.hongghe.algorithmexamples.leetcode;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author: hongghe @date: 2019-02-21 10:10
 */
public class TwoNumAddSolution {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        int sum;
        int nodeOne = 0;
        int nodeTwo = 0;
          while (l1.next != null) {
              nodeOne = nodeOne*10 + l1.val;
              nodeTwo = nodeTwo*10 + l2.val;
              l1 = l2.next;
              l2 = l2.next;
          }

          sum = nodeOne + nodeTwo;
          ListNode listNode = new ListNode(sum%10);
          if (sum%10 > 0) {
              ListNode next = new ListNode(sum%10);
              sum = sum/10;
              listNode.val = sum % 10;
              listNode.next = next;
          }
          return listNode;
    }

}
