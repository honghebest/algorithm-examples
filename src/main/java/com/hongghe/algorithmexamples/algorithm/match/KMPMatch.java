package com.hongghe.algorithmexamples.algorithm.match;

/**
 * KMP字符串匹配
 *
 * @author hongghe 2018/8/26
 */
public class KMPMatch {

    /**
     * 部分匹配表
     *
     * @param array
     */
    public static void partialMatchTable(int[] array) {

    }

    /**
     * 获取字符串的next的函数值
     *
     * @param value
     * @return next的数据组
     */
    public static int[] getNext(char[] value) {
        int[] next = new int[value.length];
        next[0] = -1;
        int i = 0;
        int j = -1;
        while (i < value.length-1) {
            if (j == -1 || value[i] == value[j]) {
                i++;
                j++;
                if (value[i] != value[j]) {
                    next[i] = j;
                } else {
                    next[j] = next[j];
                }
            } else {
                j = next[j];
            }
        }
        return next;
    }

    /**
     * KMP的实现
     *
     * @param value 主串
     * @param pattern 模式串
     * @return
     */
    public static int kmpMatch(char[] value, char[] pattern) {
        int[] next = getNext(pattern);
        int i = 0;
        int j = 0;
        while (i <= value.length-1 && j<= pattern.length-1) {
            if (j == -1 || value[i] == pattern[j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }

        if (j < pattern.length) {
            return -1;
        } else {
            // 返回模式串在主串中的头下标
            return i - pattern.length;
        }
    }
}
