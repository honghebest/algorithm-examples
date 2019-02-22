package com.hongghe.algorithmexamples.nowcoder;

/**
 * <p>在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。</>
 * @author: hongghe @date: 2019-02-22 10:20
 */
public class FindTarget {

    /**
     * 简单暴力搜索方法
     * @param target 目标值
     * @param array 二维数组
     * @return 查询结果
     */
    public boolean Find(int target, int [][] array) {
        for(int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 二分查询方法
     * @param target 目标值
     * @param array 二维数组
     * @return 查询结果
     */
    public boolean FindBinary(int target, int [][] array) {
        return false;
    }
}
