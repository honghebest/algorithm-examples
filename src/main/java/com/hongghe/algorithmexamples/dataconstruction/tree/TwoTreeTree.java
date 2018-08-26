package com.hongghe.algorithmexamples.dataconstruction.tree;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 2-3树
 * 复杂度：二叉查找树所有操作在最坏的情况下所需要的时间都和树的高度成正比。
 * 2-3 查找树引入了 2- 节点和 3- 节点，目的是为了让树平衡。一颗完美平衡的
 * 2-3查找树的所有空链接到根节点的距离应该是相同的。
 *
 * @author hongghe 2018/8/24
 */
public class TwoTreeTree {

    private static final Logger LOGGER = LoggerFactory.getLogger(TwoTreeTree.class);

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder(builderClassName = "Builder", toBuilder = true)
    public static class Node {
        public Integer left;
        public Integer right;
        public Integer middle;
        public Integer property;
        public Node leftNode;
        public Node middleNode;
        public Node rightNode;
    }

    public static void main(String[] args) {
        Gson gson = new Gson();
        Node node = Node.builder()
                .left(12312)
                .build();
        Node leftNode = new Node();
        leftNode.rightNode = node;
        System.out.println(gson.toJson(node));
    }
}
