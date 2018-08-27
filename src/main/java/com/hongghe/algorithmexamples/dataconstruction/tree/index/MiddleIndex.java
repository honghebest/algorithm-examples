package com.hongghe.algorithmexamples.dataconstruction.tree.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 二叉树的中序遍历
 *
 * @author hongghe 2018/8/27
 */
public class MiddleIndex {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Node {
        public String data;
        public Node leftNode;
        public Node rightNode;
    }

    /**
     * 递归实现前序遍历
     *
     * @param root 根结点
     */
    public static void index(Node root) {
        if (root == null) {
            return;
        }

        Node currentNode  = new Node();
        Node lastNode = new Node();
        currentNode = root;
        System.out.println(currentNode.getData());
        if (currentNode.getLeftNode() != null && currentNode != lastNode) {
            index(root.getLeftNode());
            index(root.getRightNode());
        } else {

        }
    }
}
