package com.hongghe.algorithmexamples.algorithm.binarytree;

import lombok.Builder;
import lombok.Data;

/**
 * @author hongghe 2018/9/18
 */
@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class BTreeNode {
    private final Object element;
    private final BTreeNode rightTreeNode;
    private final BTreeNode leftTreeNode;
}
