package com.hongghe.algorithmexamples.algorithm.binarytree;

import lombok.Builder;
import lombok.Data;

/**
 * @author hongghe 2018/9/18
 */
@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class BTreeNode {

    /** 二叉树中的元素 */
    private final Object element;

    /** 右二叉树 */
    private final BTreeNode rightTreeNode;

    /** 左二叉树 */
    private final BTreeNode leftTreeNode;
}
