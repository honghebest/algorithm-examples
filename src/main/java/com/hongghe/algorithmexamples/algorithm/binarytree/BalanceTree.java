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

    public int getDepth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = getDepth(root.getLeft());
        int rightDepth = getDepth(root.getRight());
        if (Math.abs(leftDepth - rightDepth) > 1) isBalance = false;
        return rightDepth > leftDepth ? rightDepth+1 : leftDepth+1;
    }
}
