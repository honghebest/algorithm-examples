package com.hongghe.algorithmexamples.cases.binary.tree.search;

import com.hongghe.algorithmexamples.data.construction.tree.BinaryTreeEntity;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hongghe 2018/9/10
 */
@Slf4j
public class BinaryTreeIndexMaxNumber {

    public int indexMaxNumber(BinaryTreeEntity<Integer> root) {
        if (root == null) {
            log.info("[indexMaxNumber]The max number.");
            return 0;
        }

        int maxNumber = root.element;
        return maxNumber;
    }

    public static void main(String[] args) {
        log.info("The value of element = {}", "asd");
    }
}
