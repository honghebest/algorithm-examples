package com.hongghe.algorithmexamples.algorithm.binarytree;

/**
 * @author: hongghe @date: 2019-04-18 18:29
 */
public class MirrorTree {

    /**
     * 二叉树变为镜像
     *
     * @param root
     */
    public static void mirror(TreeNode root) {
        if (root == null) return;
        TreeNode node = root.getLeft();
        node.setLeft(root.getRight());
        node.setRight(node);
        mirror(root.getLeft());
        mirror(root.getRight());
    }

}
