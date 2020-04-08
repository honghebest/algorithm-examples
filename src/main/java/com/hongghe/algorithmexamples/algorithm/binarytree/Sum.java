package com.hongghe.algorithmexamples.algorithm.binarytree;

/**
 * @author henry.zhang
 * @date 2019/09/20
 */
public class Sum {

    public long solution(int n) {
        if (n <= 0) {
            return 0;
        }

        long sum = 1L;
        for (int i = 1; i < n; i++) {
            sum = (2*i - 1) * sum;
        }

        return sum;
    }
}
