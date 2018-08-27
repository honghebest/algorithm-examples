package com.hongghe.algorithmexamples.dataconstruction.tree.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Stack;

/**
 * 二叉树的前序遍历
 *
 * @author hongghe 2018/8/27
 */
public class FrontIndex {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Node {
        public String data;
        public Node leftNode;
        public Node rightNode;
    }

    /**
     * 前序遍历的后续实现
     *
     * @param root 根节点
     */
    public static void frontSearch(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();

    }
}
