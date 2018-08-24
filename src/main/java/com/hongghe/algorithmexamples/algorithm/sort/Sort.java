package com.hongghe.algorithmexamples.algorithm.sort;

/**
 * @author hongghe 2018/8/24
 */
public abstract class Sort <T extends Comparable<T>> {

    public abstract void sort(T[] nums);

    protected boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }

    protected void swap(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
