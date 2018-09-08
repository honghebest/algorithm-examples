package com.hongghe.algorithmexamples.algorithm.search.half;

/**
 * @author hongghe 2018/8/26
 */
public class RecurrenceHalfSearch {

    /**
     * 递归的排序的数组
     *
     * @param array 目标数组
     * @param v 间隔
     * @param start 开始位置
     * @param end 结束位置
     * @return 深度
     */
    public static int recurrenceHalf(int[] array, int v, int start, int end) {
        if (start < end) {
            int middle = (start+end)/2;
            if (v == array[middle]) {
                return middle+1;
            } else if (v > array[middle]) {
                return recurrenceHalf(array, v, middle+1, end);
            } else {
                return recurrenceHalf(array, v, start, middle-1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {12, 123, 3, 23, 23};
        recurrenceHalf(array, 2, 0, array.length);
    }
}
