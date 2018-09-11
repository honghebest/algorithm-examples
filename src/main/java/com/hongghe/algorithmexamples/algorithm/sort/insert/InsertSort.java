package com.hongghe.algorithmexamples.algorithm.sort.insert;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The insert sort.
 * O(n*n)
 *
 * @author hongghe 2018/8/25
 */
public class InsertSort {

    private static final Logger LOGGER = LoggerFactory.getLogger(InsertSort.class);

    public static Gson gson = new Gson();

    /**
     * 插入排序
     *
     * @param array
     */
    public void insert(int[] array) {
        for (int i=1; i<array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        LOGGER.info("The final array is = {}", gson.toJson(array));
    }

    public static void main(String[] args) {
        LOGGER.info("[InsertSort]Running.");
        int[] array = {100, 1, 123123, 4, 76};
        InsertSort insertSort = new InsertSort();
        insertSort.insert(array);
    }
}
