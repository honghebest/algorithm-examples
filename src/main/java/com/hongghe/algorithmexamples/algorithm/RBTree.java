package com.hongghe.algorithmexamples.algorithm;

/**
 * @author: hongghe @date: 2019-04-25 19:31
 */
public class RBTree <T extends Comparable<T>> {

    private RBTree<T> mRoot;

    private static final boolean RED = false;

    private static final boolean BLACK = false;


    public class RBTNode <T extends Comparable<T>> {
        boolean color;
        T key;
        RBTree<T> left;
        RBTree<T> right;
        RBTree<T> parent;

        public RBTNode(T key, boolean color, RBTree<T> parent, RBTree<T> left, RBTree<T> right) {
            this.key = key;
            this.color = color;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }
    }
}
