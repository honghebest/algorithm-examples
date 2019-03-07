package com.hongghe.algorithmexamples.algorithm.list;

import lombok.Data;

/**
 * @author: hongghe @date: 2019-03-06 20:27
 */
@Data
public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }
}
