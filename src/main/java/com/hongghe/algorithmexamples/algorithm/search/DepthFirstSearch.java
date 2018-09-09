package com.hongghe.algorithmexamples.algorithm.search;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 深度优先遍历
 *
 * @author hongghe 2018/8/26
 */
public class DepthFirstSearch {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepthFirstSearch.class);

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder(builderClassName = "Builder", toBuilder = true)
    static class GraphNode {
        public Integer data;
        public List<GraphNode> graphNodes;
    }
}
