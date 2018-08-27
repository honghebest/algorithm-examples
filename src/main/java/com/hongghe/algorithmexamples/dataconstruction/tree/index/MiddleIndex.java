package com.hongghe.algorithmexamples.dataconstruction.tree.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
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
}
