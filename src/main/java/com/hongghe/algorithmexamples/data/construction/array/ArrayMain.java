package com.hongghe.algorithmexamples.data.construction.array;

import com.hongghe.algorithmexamples.data.construction.link.Node;

/**
 * @author hongghe 2019/1/1
 */
public class ArrayMain {

    public static void main(String[] args) {
        Node node = new Node(1, new Node(), new Node());
        System.out.println(node.toString());
    }
}
