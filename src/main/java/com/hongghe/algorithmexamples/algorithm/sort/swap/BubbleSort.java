package com.hongghe.algorithmexamples.algorithm.sort.swap;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 冒泡排序
 * 时间复杂度: O(n*n)
 *
 * @author hongghe 2018/8/25
 */
@Slf4j
public class BubbleSort {

    private static Gson gson = new Gson();

    public void  bubble(int[] array) {
        if (array == null || array.length == 0) {
            return;
        } else {
            for (int i=0; i<array.length-1; i++) {
                for (int j=array.length-1; j<i; j--) {
                    if (array[j] < array[j-1]) {
                        swap(array, j-1, j);
                    }
                    log.info("array is = {}", gson.toJson(array));
                }
            }
        }
    }

    /**
     * 交换两个数据
     *
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
