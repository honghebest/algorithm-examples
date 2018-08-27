package com.hongghe.algorithmexamples.dataconstruction.tree;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/25
 */
public class BalancedTree {

    private static final Logger LOGGER = LoggerFactory.getLogger(BalancedTree.class);

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder(builderClassName = "Builder", toBuilder = true)
    public static class Node {
        public Integer data;
        public Integer balanceRate;
        public Node leftNode;
        public Node rightNode;
    }

    /**
     * Right rotate.
     *
     * @param node
     */
    public void rightRotate(Node node) {
    }

    /**
     * Left rotate.
     *
     * @param node
     */
    public void leftRotate(Node node) {

    }

    /**
     * Left left rotate
     * @param node
     */
    public static void leftLeftRotate(Node node) {

    }

    /**
     * right right rotate.
     *
     * @param node
     */
    public static void rightRightRotate(Node node) {

    }
}
