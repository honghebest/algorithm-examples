package com.hongghe.algorithmexamples.algorithm.binarytree;

/**
 * @author: hongghe @date: 2019-04-18 22:26
 */
public class SearchXTree {

    /**
     * 二叉搜索树的第k个节点
     * 给定一颗二叉搜索树，请找出其中的第k大的结点。例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4。
     */

    public TreeNode searchX(TreeNode root, int k) {
        int index = 0;
        if(root!=null){
            TreeNode node=searchX(root.getLeft(),k);
            if(node!=null)
                return node;
            index++;
            if(index==k)
                return root;
            node=searchX(root.getRight(),k);
            if(node!=null)
                return node;
        }
        return null;
    }
}
