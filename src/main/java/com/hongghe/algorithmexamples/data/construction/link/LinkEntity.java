package com.hongghe.algorithmexamples.data.construction.link;

/**
 * @author hongghe 2018/8/20
 */
public class LinkEntity {
    public Object element;
    public LinkEntity next;

    public LinkEntity getNext() {
        return next;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Object getElement() {
        return element;
    }


    public void setNext(LinkEntity next) {
        this.next = next;
    }
}
