package com.hongghe.algorithmexamples.algorithm.search.domain;

import lombok.Data;

/**
 * @author: hongghe @date: 2019-03-13 10:58
 */
@Data
public class GraphNode {
    private int data;
    private GraphNode left;
    private GraphNode right;
}
