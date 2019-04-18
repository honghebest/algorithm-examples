package com.hongghe.algorithmexamples.algorithm.binarytree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author: hongghe @date: 2019-04-18 18:32
 */
public class TreeNodeDataCompute {

    /**
     * 题目描述：输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
     * DFS问题，可以用栈也可以用list。
     */

    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> all = new ArrayList<>();
        if (root == null) return all;
        Stack<Integer> stack = new Stack<>();
        // 覆盖
        return all;
    }

    public void findPath(TreeNode root, int target, Stack<Integer> stack, ArrayList<ArrayList<Integer>> all) {
        if (root == null) return;
        if ((root.getLeft() == null && root.getRight() == null) && root.getData() == target) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i : stack) {
                list.add(new Integer(root.getData()));
            }

            list.add(new Integer(root.getData()));
            all.add(list);
        } else {
            stack.push(new Integer(root.getData()));
            findPath(root.getLeft(), target-root.getData(), stack, all);
            findPath(root.getRight(), target-root.getData(), stack, all);
            stack.pop();
        }
    }
}
