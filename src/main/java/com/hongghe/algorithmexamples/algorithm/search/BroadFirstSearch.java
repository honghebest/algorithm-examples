package com.hongghe.algorithmexamples.algorithm.search;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 广度优先遍历
 *
 * @author hongghe 2018/8/26
 */
@Slf4j
public class BroadFirstSearch {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder(builderClassName = "Builder", toBuilder = true)
    static class GraphNode {
        public Integer data;
        public List<GraphNode> graphNodes;
    }

    public void depthSearch() {
        log.info("[depthSearch]Start depth search.");
    }

    public static void main(String[] args) {
        GraphNode graphNode  = new GraphNode();
    }
}
