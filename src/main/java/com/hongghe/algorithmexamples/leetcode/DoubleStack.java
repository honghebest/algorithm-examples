package com.hongghe.algorithmexamples.leetcode;

import java.util.Stack;

/**
 * @author: hongghe @date: 2019-03-24 16:28
 */
public class DoubleStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.empty() && stack2.empty()) {
            throw new RuntimeException("queue is empty.");
        }

        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
