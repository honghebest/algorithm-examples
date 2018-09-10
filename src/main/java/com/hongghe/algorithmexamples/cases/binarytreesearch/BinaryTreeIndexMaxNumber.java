package com.hongghe.algorithmexamples.cases.binarytreesearch;

import com.hongghe.algorithmexamples.dataconstruction.tree.BinaryTreeEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/9/10
 */
public class BinaryTreeIndexMaxNumber {

    private static final Logger LOGGER = LoggerFactory.getLogger(BinaryTreeIndexMaxNumber.class);

    public int indexMaxNumber(BinaryTreeEntity<Integer> root) {
        if (root == null) {
            return 0;
        }

        int maxNumber = root.element;
    }
}
