package com.hongghe.algorithmexamples.algorithm.search.half;

/**
 * @author: hongghe @date: 2019-03-13 10:41
 */
public class BinarySearch {

    public static int binSearch(int[] array, int a) {
        int low = 0;
        int high = array.length - 1;
        int middle;
        while (low <= high) {
            middle = (low + high)/2;
            if (array[middle] == a) {
                return middle + 1;
            } else if (array[middle] < a) {
                low = middle + 1;
            } else {
                high = middle + 1;
            }
        }
        return -1;
    }

    public static int sort(int[] array, int a, int low ,int high) {
        if (low < high) {
            int middle = (low + high)/2;
            if (a == array[middle]) {
                return middle + 1;
            } else if (a > array[middle]) {
                return sort(array, a, middle+1, high);
            } else {
                return sort(array, a, low, middle-1);
            }
        }
        return -1;
    }


}
