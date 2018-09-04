package com.hongghe.algorithmexamples.dataconstruction.tree.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Stack;

/**
 * 二叉树的后续遍历
 *
 * @author hongghe 2018/8/27
 */
public class BackIndex {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Node {
        public String data;
        public Node leftNode;
        public Node rightNode;
    }

    /**
     * 后续遍历的递归实现
     *
     * @param root 根结点
     */
    public static void backBinaryIndex(Node root) {
        if (root == null) {
            return;
        }


    }

    /**
     * 后续遍历的非递归实现
     *
     * @param root 跟节点
     */
    public static void backIndex(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node currentNode = new Node();
        Node lastVisitNode = new Node();
        currentNode = root;
        lastVisitNode= null;

        while (currentNode != null) {
            stack.push(currentNode);
            currentNode = currentNode.getLeftNode();
        }

        while (!stack.empty()) {
            currentNode = stack.pop();
            if (currentNode.getRightNode() != null &&
                    currentNode.getRightNode() != lastVisitNode) {
                stack.push(currentNode);
                currentNode.getRightNode();
                while (currentNode != null) {
                    stack.push(currentNode);
                    currentNode = currentNode.getLeftNode();
                }
            } else {
                System.out.println(currentNode.getData());
                lastVisitNode = currentNode;
            }
        }
    }
}
