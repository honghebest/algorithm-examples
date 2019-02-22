package com.hongghe.algorithmexamples.nowcoder;

import com.hongghe.algorithmexamples.nowcoder.domain.ListNode;

import java.util.ArrayList;

/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 *
 * @author: hongghe @date: 2019-02-22 10:40
 */
public class PrintListFromTailToHead {

    public ArrayList<Integer> print(ListNode listNode) {
        if (listNode == null) {
            return new ArrayList<>();
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        do {
            arrayList.add(listNode.val);
            listNode = listNode.next;
        } while (listNode != null && listNode.next == null) ;{
            arrayList.add(listNode.val);
            return arrayList;
        }
    }
}
