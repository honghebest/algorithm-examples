package com.hongghe.algorithmexamples.dataconstruction.tree;

/**
 * 二叉树的操作
 *
 * @author hongghe 2018/8/22
 */
public class BinaryTree {

    /**
     * 获取二叉树的深度
     *
     * @param binaryTreeEntity 二叉树的结构
     * @return 深度
     */
    public int getDepth(BinaryTreeEntity binaryTreeEntity) {
        if (binaryTreeEntity == null) {
            return 0;
        } else {
            int leftDepth = getDepth(binaryTreeEntity.leftChild) + 1;
            int rightDepth = getDepth(binaryTreeEntity.rightChild) + 1;
            return leftDepth > rightDepth ? leftDepth : rightDepth;
        }
    }
}
