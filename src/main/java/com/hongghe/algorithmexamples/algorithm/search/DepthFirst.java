package com.hongghe.algorithmexamples.algorithm.search;

import java.util.*;

/**
 * @author: hongghe @date: 2019-03-13 11:00
 */
public class DepthFirst {

    public void search() {
        Stack<Map<String, Object>> nodeStack = new Stack<Map<String, Object>>();
        Map<String, Object> node = new HashMap<>();
        nodeStack.add(node);
        while (!nodeStack.isEmpty()) {
            node = nodeStack.pop();
            System.out.println(node);
            List<Map<String, Object>> children = getChildren(node);
            if (children != null && !children.isEmpty()) {
                for (Map child : children) {
                    nodeStack.push(child);
                }
            }
        }
    }

    public List<Map<String, Object>> getChildren(Map<String, Object> node) {
        List<Map<String, Object>> list = new ArrayList<>();
        return list;
    }
}
