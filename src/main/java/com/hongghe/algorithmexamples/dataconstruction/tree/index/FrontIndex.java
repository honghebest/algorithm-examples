package com.hongghe.algorithmexamples.dataconstruction.tree.index;

import lombok.Data;

import java.util.Stack;

/**
 * @author hongghe 2018/8/27
 */
public class FrontIndex {

    @Data
    static class Node {
        public String data;
        public Node leftNode;
        public Node rightNode;
    }

    public void index(Node root) {
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
