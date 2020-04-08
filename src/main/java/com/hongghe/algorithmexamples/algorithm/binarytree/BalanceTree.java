package com.hongghe.algorithmexamples.algorithm.binarytree;

/**
 * @author: hongghe @date: 2019-04-18 18:06
 */
public class BalanceTree {

    public volatile boolean isBalance = true;

    public boolean isBalanceTree(TreeNode root) {
        getDepth(root);
        return isBalance;
    }

    /**
     * <pre>求深度</pre>
     *
     * @param root 根节点
     * @return 返回深度
     */
    public int getDepth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = getDepth(root.getLeft());
        int rightDepth = getDepth(root.getRight());
        if (Math.abs(leftDepth - rightDepth) > 1) isBalance = false;
        return rightDepth > leftDepth ? rightDepth+1 : leftDepth+1;
    }


    /**
     * <p>The depth of binary tree.</p>
     *
     * @param root root of tree
     * @return the number of tree
     */
    public static int depth(TreeNode root) {
        if (root == null) return 0;
        return depth(root.getLeft()) > depth(root.getRight()) ?
                depth(root.getLeft()) + 1 : depth(root.getRight()) + 1;
    }
}
