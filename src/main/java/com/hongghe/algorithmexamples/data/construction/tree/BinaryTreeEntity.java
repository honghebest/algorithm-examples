package com.hongghe.algorithmexamples.data.construction.tree;

/**
 * @author hongghe 2018/8/21
 */
public class BinaryTreeEntity<T> {

    public T element;
    public BinaryTreeEntity leftChild;
    public BinaryTreeEntity rightChild;
    public Integer depth;

    public Object getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public BinaryTreeEntity getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeEntity leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTreeEntity getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTreeEntity rightChild) {
        this.rightChild = rightChild;
    }

    public Integer getDeepth() {
        return depth;
    }

    public void setDeepth(Integer deepth) {
        this.depth = deepth;
    }
}
