package com.hongghe.algorithmexamples.algorithm.search.half;

/**
 * @author hongghe 2018/8/26
 */
public class NorecurrenceHalf {

    /**
     * 非递归的排序
     *
     * @param array 待排序数组
     * @param v 间隔
     * @return
     */
    public static int norecurrenceHalf(int[]array, int v) {
        int start = 0;
        int end = array.length-1;
        int middle;
        while (start <= end) {
            middle = (start+end)/2;
            if (array[middle] == v) {
                return middle+1;
            } else if (array[middle] < v) {
                start = middle+1;
            } else {
                end = middle-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 231, 12312, 1231, 32};
        norecurrenceHalf(array, 2);
    }
}
