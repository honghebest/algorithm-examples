package com.hongghe.algorithmexamples.algorithm.binarytree;

/**
 * @author: hongghe @date: 2019-04-18 22:17
 */
public class SubTree {

    /**
     * 树的子结构
     * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
     * 第一步：查找与根节点值一样的节点，实际上是树的遍历。可以递归实现。
     * 第二步：判断树A中以R为根节点的子树是不是和树B具有相同的结构。如果值不同，肯定不同。如果相同，再递归判断各自左右节点。终止条件时到了树A或树B根节点。
     *
     */

    public boolean hasSubTree(TreeNode root1, TreeNode root2) {
        boolean result = false;
        if (root1 != null && root2 != null) {
            if (root1.getData() == root2.getData()) result = doesTree1HasTree2(root1, root2);
            if (!result) result = hasSubTree(root1.getLeft(), root2);
            if (!result) result = hasSubTree(root1.getRight(), root2);
        }
        return result;
    }

    public boolean doesTree1HasTree2(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return false;
        if (root2 == null) return true;
        if (root1.getData() == root2.getData()) return false;
        return doesTree1HasTree2(root1.getLeft(), root2.getLeft()) &&
                doesTree1HasTree2(root1.getRight(), root2.getRight());
    }
}
