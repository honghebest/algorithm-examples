package com.hongghe.algorithmexamples.algorithm.binarytree;

/**
 * @author: hongghe @date: 2019-04-18 18:02
 */
public class DeepthTree {

    /**
     * 求深度
     *
     * @param root 根节点
     * @return
     */
    public static int deepth(TreeNode root) {
        if (root == null) return 0;
        int leftDeep = deepth(root.getLeft()) + 1;
        int rightDeep = deepth(root.getRight()) + 1;
        return Math.max(leftDeep, rightDeep);
    }

    /**
     * 求树的最大深度
     *
     * @param root 根节点
     * @return
     */
    public static int depthestTree(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = depthestTree(root.getLeft());
        int rightDepth = depthestTree(root.getRight());
        return Math.max(leftDepth, rightDepth) + 1;
    }

    /**
     * 求树的最小深度
     *
     * @param root 根节点
     * @return
     */
    public static int poorTree(TreeNode root) {
        if (root == null) return 0;
        if (root.getLeft() ==  null && root.getRight() == null) {
            return 1;
        }
        return Math.min(poorTree(root.getLeft()), poorTree(root.getRight())) + 1;
    }

    /**
     * 求节点的个数
     *
     * @param root 根节点
     * @return
     */
    public static int getNodeNum(TreeNode root) {
        if (root == null) return 0;
        return getNodeNum(root.getLeft()) + getNodeNum(root.getRight()) + 1;
    }

    /**
     * 求叶节点的个数
     *
     * @param root 根节点
     * @return 个数
     */
    public static int leafNodeNum(TreeNode root) {
        if (root == null) return 0;
        if (root.getLeft() == null && root.getRight() == null) {
            return 1;
        }
        return leafNodeNum(root.getLeft()) + leafNodeNum(root.getRight());
    }

    /**
     * 求特定层的节点的个数
     *
     * @param root
     * @param k
     * @return
     */
     public static int levelNodeNum(TreeNode root, int k) {
        if (root == null || k < 1) return 0;
        if (k == 1) return 1;
        return levelNodeNum(root.getLeft(), k-1) + levelNodeNum(root.getRight(), k-1);
     }
}
