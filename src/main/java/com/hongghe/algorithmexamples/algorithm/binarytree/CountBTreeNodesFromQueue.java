package com.hongghe.algorithmexamples.algorithm.binarytree;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * 非递归的计算二叉树的节点和深度
 *
 * @author hongghe 2018/9/18
 */
public class CountBTreeNodesFromQueue {

    public int count(BTreeNode root) {
        if (root ==  null) {
            return 0;
        }

        Queue<Object> queue = new ConcurrentLinkedQueue<>();
        if (count(root.getLeftTreeNode()) > 0) queue.add(root.getLeftTreeNode().getElement());
        queue.add(root.getElement());
        if (count(root.getRightTreeNode()) > 0) queue.add(root.getRightTreeNode().getElement());
        return queue.size();
    }
}
