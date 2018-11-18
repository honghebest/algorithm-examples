package com.hongghe.algorithmexamples.data.construction.tree;

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

    /**
     * 获取第n层节点的个数
     *
     * @param entity 二叉树的结构
     * @param level 第n层
     * @return 节点的个数
     */
    public int getLevelNoeAmount(BinaryTreeEntity entity, int level) {
        if (entity == null || level < 1) {
            return 0;
        } else {
            if (level == 1) {
                return 1;
            } else {
                return getLevelNoeAmount(entity.leftChild, level-1) +
                        getLevelNoeAmount(entity.rightChild, level-1);
            }
        }
    }

    /**
     * 比较二叉树的左右的结构是否一样
     *
     * @param leftEntity 二叉树的左结构
     * @param rightEntity 二叉树的右结构
     * @return 是否一样
     */
    public boolean compareBTreeConstruct(BinaryTreeEntity leftEntity, BinaryTreeEntity rightEntity) {
        if (leftEntity == null && rightEntity == null) {
            return true;
        } else if (leftEntity == null || rightEntity == null) {
            return false;
        }
        boolean resultLeft = compareBTreeConstruct(leftEntity.leftChild, leftEntity.rightChild);
        boolean resultRight = compareBTreeConstruct(rightEntity.leftChild, rightEntity.rightChild);
        return resultLeft && resultRight;
    }

    /**
     * 求一个二叉树的镜像
     *
     * @param entity 所求二叉树的结构
     * @return 镜像二叉树
     */
    public BinaryTreeEntity mirror(BinaryTreeEntity entity) {
        if (entity == null) {
            return null;
        } else {
            BinaryTreeEntity binaryTreeEntity = entity.leftChild;
            entity.leftChild = entity.getRightChild();
            entity.rightChild = binaryTreeEntity;
            mirror(entity.leftChild);
            mirror(entity.rightChild);
        }
        return entity;
    }
}
