package com.hongghe.algorithmexamples.dataconstruction.tree;

import java.util.List;

/**
 * @author hongghe 2018/8/20
 */
public class Entity {

    public Object element;
    public List<Entity> subEntity;
    public int deepth;

    public void setElement(Object element) {
        this.element = element;
    }

    public Object getElement() {
        return element;
    }

    public List<Entity> getSubEntity() {
        return subEntity;
    }

    public void setSubEntity(List<Entity> subEntity) {
        this.subEntity = subEntity;
    }

    public void setDeepth(int deepth) {
        this.deepth = deepth;
    }

    public int getDeepth() {
        return deepth;
    }
}
