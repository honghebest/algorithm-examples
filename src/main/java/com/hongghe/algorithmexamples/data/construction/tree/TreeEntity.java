package com.hongghe.algorithmexamples.data.construction.tree;

import java.util.List;

/**
 * @author hongghe 2018/8/20
 */
public class TreeEntity {

    public Object element;
    public List<TreeEntity> subTreeEntity;
    public int depth;

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
        this.depth = deepth;
    }

    public int getDeepth() {
        return depth;
    }
}
