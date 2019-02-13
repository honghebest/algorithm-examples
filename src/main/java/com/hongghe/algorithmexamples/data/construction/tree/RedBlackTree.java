package com.hongghe.algorithmexamples.data.construction.tree;

import com.hongghe.algorithmexamples.data.construction.tree.domain.Entry;

/**
 * 红黑树
 *
 * @author hongghe 2018/8/24
 */
public class RedBlackTree {

    public Entry root;

    //这里 p 代表 x
    private void rotateLeft(Entry p) {
        if (p != null) {
            Entry r = p.right; // p 是上图中的 x，r 就是 y
            p.right = r.left;       // 左旋后，x 的右子树变成了 y 的左子树 β
            if (r.left != null)
                r.left.parent = p;  //β 确认父亲为 x
            r.parent = p.parent;        //y 取代 x 的第一步：认 x 的父亲为爹
            if (p.parent == null)       //要是 x 没有父亲，那 y 就是最老的根节点
                root = r;
            else if (p.parent.left == p) //如果 x 有父亲并且是它父亲的左孩子，x 的父亲现在认 y 为左孩子，不要 x 了
                p.parent.left = r;
            else                            //如果 x 是父亲的右孩子，父亲就认 y 为右孩子，抛弃 x
                p.parent.right = r;
            r.left = p;     //y 逆袭成功，以前的爸爸 x 现在成了它的左孩子
            p.parent = r;
        }
    }

    private void rotateRight(Entry p) {
        if (p != null) {
            Entry l = p.left;
            p.left = l.right;
            if (l.right != null) l.right.parent = p;
            l.parent = p.parent;
            if (p.parent == null)
                root = l;
            else if (p.parent.right == p)
                p.parent.right = l;
            else p.parent.left = l;
            l.right = p;
            p.parent = l;
        }
    }
}
