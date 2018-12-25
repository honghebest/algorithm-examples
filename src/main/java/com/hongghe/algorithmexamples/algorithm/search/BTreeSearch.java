package com.hongghe.algorithmexamples.algorithm.search;

import com.hongghe.algorithmexamples.algorithm.binarytree.BTreeNode;

/**
 * @author hongghe 2018/12/25
 */
public class BTreeSearch {

    /**
     * 递归遍历先续
     *
     * @param bTreeNode 开始节点
     */
    public static void preOrder(BTreeNode bTreeNode) {
        if (bTreeNode == null) {
            return;
        }

        System.out.println(bTreeNode.getElement());
        preOrder(bTreeNode.getLeftTreeNode());
        preOrder(bTreeNode.getRightTreeNode());
    }

    /**
     * 递归中续遍历
     *
     * @param bTreeNode 开始节点
     */
    public static void middleOrder(BTreeNode bTreeNode) {
        if (bTreeNode == null) {
            return;
        }

        middleOrder(bTreeNode.getLeftTreeNode());
        System.out.println(bTreeNode.getElement());
        middleOrder(bTreeNode.getRightTreeNode());
    }


    /**
     * 递归遍历后续遍历
     *
     * @param bTreeNode 开始节点
     */
    public static void backOrder(BTreeNode bTreeNode) {
        if (bTreeNode == null) {
            return;
        }

        backOrder(bTreeNode.getLeftTreeNode());
        backOrder(bTreeNode.getRightTreeNode());
        System.out.println(bTreeNode.getElement());
    }

}
