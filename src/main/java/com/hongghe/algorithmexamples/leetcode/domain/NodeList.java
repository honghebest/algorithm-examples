package com.hongghe.algorithmexamples.leetcode.domain;

import lombok.Data;

/**
 * @author: hongghe @date: 2019-04-21 22:19
 */
@Data
public class NodeList {
    private int val;
    private ListNode next;

    NodeList(int x) {
        val = x;
    }
}
