package com.hongghe.algorithmexamples.cases.binary.tree.search;

import com.hongghe.algorithmexamples.data.construction.tree.BinaryTreeEntity;

/**
 * @author hongghe 2018/9/10
 */
public class BinaryTreeIndexMaxNumber {

    public int indexMaxNumber(BinaryTreeEntity<Integer> root) {
        if (root == null) {
            System.out.println("[indexMaxNumber]The max number.");
            return 0;
        }

        int maxNumber = root.element;
        return maxNumber;
    }

    public static void main(String[] args) {
        System.out.println("The value of element = {}" +  "asd");
    }
}
