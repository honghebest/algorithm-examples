package com.hongghe.algorithmexamples.algorithm.binarytree;

/**
 * @author: hongghe @date: 2019-04-18 18:02
 */
public class DeepthTree {

    /**
     * 求深度
     *
     * @param root
     * @return
     */
    public static int deepth(TreeNode root) {
        if (root == null) return 0;
        int leftDeep = deepth(root.getLeft()) + 1;
        int rightDeep = deepth(root.getRight()) + 1;
        return Math.max(leftDeep, rightDeep);
    }
}
