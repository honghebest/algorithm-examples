package com.hongghe.algorithmexamples.dataconstruction.link;

/**
 * @author hongghe 2018/8/21
 */
public class Node {

    public Object element;
    public Node frontNode;
    public Node backNode;

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Node getBackNode() {
        return backNode;
    }

    public void setBackNode(Node backNode) {
        this.backNode = backNode;
    }

    public Node getFrontNode() {
        return frontNode;
    }

    public void setFrontNode(Node frontNode) {
        this.frontNode = frontNode;
    }
}
