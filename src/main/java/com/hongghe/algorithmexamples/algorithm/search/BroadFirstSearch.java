package com.hongghe.algorithmexamples.algorithm.search;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 广度优先遍历
 *
 * @author hongghe 2018/8/26
 */
public class BroadFirstSearch {

    private static final Logger LOGGER = LoggerFactory.getLogger(BroadFirstSearch.class);

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder(builderClassName = "Builder", toBuilder = true)
    static class GraphNode {
        public Integer data;
        public List<GraphNode> graphNodes;
    }

    public void depthSearch() {
        LOGGER.info("[depthSearch]Start depth search.");
    }
}
