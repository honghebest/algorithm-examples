package com.hongghe.algorithmexamples.algorithm.sort.sourcecode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author hongghe 2018/8/26
 */
public class ArraySort {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("6", "1", "3", "1","2");
        Collections.sort(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
