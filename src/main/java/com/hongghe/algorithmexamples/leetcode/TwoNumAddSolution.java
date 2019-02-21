package com.hongghe.algorithmexamples.leetcode;

import java.util.LinkedList;
import java.util.List;

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
          List<Integer> list = new LinkedList<>();
          while (l1.next != null) {
             ((LinkedList<Integer>) list).push(l1.val + l2.val);
              l1 = l2.next;
              l2 = l2.next;
          }

        ListNode listNode = new ListNode(0);
        for (int i=0; i<list.size(); i++) {
            listNode.val = list.get(list.size()-i-1);
            listNode = listNode.next;
        }
        return listNode;
    }

}
