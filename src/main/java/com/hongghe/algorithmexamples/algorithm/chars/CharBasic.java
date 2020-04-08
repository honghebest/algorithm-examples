package com.hongghe.algorithmexamples.algorithm.chars;

/**
 * @author: hongghe @date: 2019-04-20 11:24
 */
public class CharBasic {

    /**
     * 判断是否为回文数
     *
     * @param string
     * @param start
     * @param end
     * @return
     */
    public boolean isPalindrome(String string, int start, int end) {
        for (; start<end; ++start, --end) {
            if (string.charAt(start) != string.charAt(end)) return false;
        }
        return true;
    }

    /**
     * 求最大子串
     *
     * @param string
     * @return
     */
    public String longestPalindrome(String string) {
        int length = string.length(), maxLen = 1;
        int start = 0, i, j;
        for (i=0; i<length-1; i++) {
            for (j = i + 1; j < length; j++) {
                if (isPalindrome(string, i, j));
                int pLength = j-i+1;
                if (pLength > maxLen) {
                    start = i;
                    maxLen = pLength;
                }
            }
        }
        return string.substring(start, maxLen);
    }
}
