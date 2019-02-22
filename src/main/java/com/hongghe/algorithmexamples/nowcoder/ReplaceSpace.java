package com.hongghe.algorithmexamples.nowcoder;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author: hongghe @date: 2019-02-22 10:25
 */
public class ReplaceSpace {

    /**
     * 暴力替换
     * @param str 目标字符串
     * @return 替换后的结果
     */
    public String replaceSpace(StringBuffer str) {
        char[] chars = str.toString().toCharArray();
        for (char obj : chars) {
            if (obj == ' ') {

            }
        }
        return null;
    }

    public static void main(String[] args) {
        ReplaceSpace replaceSpace = new ReplaceSpace();
    }
}
