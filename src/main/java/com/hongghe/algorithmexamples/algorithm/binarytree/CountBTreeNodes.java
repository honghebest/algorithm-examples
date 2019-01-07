package com.hongghe.algorithmexamples.algorithm.binarytree;

/**
 * 递归计算二叉树的节点和二叉树的深度
 *
 * @author hongghe 2018/9/18
 */
public class CountBTreeNodes {

    /**
     * 计算二叉树上的节点的个数
     *
     * @param root 二叉树的根结点
     * @return 节点的个数
     */
    public static int getNodesOfBTree(BTreeNode root) {
        if (null == root) {
            return -1;
        } else {
            return getNodesOfBTree(root.getLeftTreeNode()) + getNodesOfBTree(root.getRightTreeNode()) + 1;
        }
    }

    /**
     * 计算二叉树的深度
     *
     * @param root 二叉树的根结点
     * @return 二叉树的深度
     */
    public static int getDepthOfBTree(BTreeNode root) {
        if (null == root) {
            return 0;
        } else {
            return getDepthOfBTree(root.getRightTreeNode()) > getDepthOfBTree(root.getLeftTreeNode()) ?
                    getDepthOfBTree(root.getRightTreeNode()) + 1 : getDepthOfBTree(root.getLeftTreeNode()) + 1;
        }
    }

    /**
     * 计算左子树的节点的个数
     *
     * @param root 根结点
     * @return 左子树的节点的个数
     */
    public static int getNodesOtLeftBTree(BTreeNode root) {
        if (null == root || null == root.getLeftTreeNode()) {
            return 0;
        } else {
            return getNodesOtLeftBTree(root.getLeftTreeNode());
        }
    }

    /**
     * 计算二叉树的右子树的节点的个数
     *
     * @param root 二叉树的根结点
     * @return 右子树的节点的个数
     */
    public static int getNodesOfRight(BTreeNode root) {
        if (null == root || null == root.getRightTreeNode()) {
            return 0;
        } else {
            return getNodesOfRight(root.getRightTreeNode());
        }
    }
}
