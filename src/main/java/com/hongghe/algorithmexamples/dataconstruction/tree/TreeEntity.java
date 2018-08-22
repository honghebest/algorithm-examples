package com.hongghe.algorithmexamples.dataconstruction.tree;

import java.util.List;

/**
 * @author hongghe 2018/8/20
 */
public class TreeEntity {

    public Object element;
    public List<TreeEntity> subTreeEntity;
    public int deepth;

    public void setElement(Object element) {
        this.element = element;
    }

    public Object getElement() {
        return element;
    }

    public List<TreeEntity> getSubEntity() {
        return subTreeEntity;
    }

    public void setSubEntity(List<TreeEntity> subTreeEntity) {
        this.subTreeEntity = subTreeEntity;
    }

    public void setDeepth(int deepth) {
        this.deepth = deepth;
    }

    public int getDeepth() {
        return deepth;
    }
}
