package com.hongghe.algorithmexamples.algorithm.search.half;

/**
 * @author hongghe 2018/8/26
 */
public class RecurrenceHalfSearch {

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
}
