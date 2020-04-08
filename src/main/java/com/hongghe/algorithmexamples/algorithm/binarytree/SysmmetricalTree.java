package com.hongghe.algorithmexamples.algorithm.binarytree;

/**
 * @author: hongghe @date: 2019-04-18 22:14
 */
public class SysmmetricalTree {

    /**
     * 判断二叉树是否对称
     * 左节点的右子树和右节点的左子树相同 使用递归
     */
    public boolean isSysmmetrical(TreeNode root) {
        if (root == null) return true;
        return comRoot(root.getLeft(), root.getRight());
    }

    public boolean comRoot(TreeNode left, TreeNode right) {
        if (left == null) return right == null;
        if (right == null) return false;
        if (left.getData() != right.getData()) return false;
        return comRoot(left.getRight(), right.getLeft()) && comRoot(left.getLeft(), right.getRight());
    }
}
