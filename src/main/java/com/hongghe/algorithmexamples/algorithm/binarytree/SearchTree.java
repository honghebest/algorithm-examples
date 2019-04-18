package com.hongghe.algorithmexamples.algorithm.binarytree;

/**
 * @author: hongghe @date: 2019-04-18 18:23
 */
public class SearchTree {

    /**
     * 如数组{5,7,6,9,11,10,8} 是二叉搜索树后序遍历序列。发现根节点8，576小于8，是8左子树，91110大于8是右子树，
     * 而6又是左子树根节点，10是右子树根节点，发现是递归问题。
     * 方法：从前往后遍历，大于根节点时，为右子树。遍历右子树节点，如果右子树中有节点值小于根节点，则返回false。对左子树右子树进行递归判断。
     *
     * @param array
     * @param start
     * @param end
     * @return
     */
    public boolean judge(int[] array, int start, int end) {
        if (start >= end) return true;
        int i = start;
        while (i < end && array[i] < array[end]) {
            i++;
        }
        for (int j=i; j<end; j++) {
            if (array[j] < array[end]) return false;
        }
        return judge(array, start, i-1) && judge(array, i, end-1);
    }
}
