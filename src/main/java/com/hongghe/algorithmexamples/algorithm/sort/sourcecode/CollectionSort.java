package com.hongghe.algorithmexamples.algorithm.sort.javasourcesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author hongghe 2018/8/26
 */
public class CollectionSort {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 7, 2, 10, 323, 2, 342, 43);
        List<String> sortList = new ArrayList<>();
        sortList.add("asdasdas");
        sortList.add("aaa");
        sortList.add("name");
        Collections.sort(sortList);
        System.out.println(sortList);
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
