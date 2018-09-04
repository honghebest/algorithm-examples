package com.hongghe.algorithmexamples.algorithm.sort.merge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 归并排序
 *
 * @author hongghe 2018/8/25
 */
public class MergeSort {

    private static final Logger LOGGER = LoggerFactory.getLogger(MergeSort.class);

    public static void main(String[] args) {
        int[] exampleNumbers = {1, 2, 3424, 3, 234234, 67, 6, 67, 1, 12312, 123131, 31232131, 4, 1231};
        int distance = 6;
        sort(exampleNumbers, distance);
    }

    /**
     * 归并排序
     *
     * @param array 入参是整数类型的数组
     * @return 排序好的数据，顺序是从小到大
     */
    public static int[] sort(int[] array, int distance) {
        if (array == null || array.length <= 0) {
            LOGGER.info("Sorry,the input array is null or empty.");
            return array;
        }

        return null;
    }
}
