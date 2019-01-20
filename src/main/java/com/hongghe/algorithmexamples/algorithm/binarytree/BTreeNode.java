package com.hongghe.algorithmexamples.algorithm.binarytree;

import lombok.Data;

/**
 * @author hongghe 2018/9/18
 */
@Data
public class BTreeNode {

    /** 二叉树中的元素 */
    private Object element;

    /** 右二叉树 */
    private BTreeNode rightTreeNode;

    /** 左二叉树 */
    private BTreeNode leftTreeNode;
}
