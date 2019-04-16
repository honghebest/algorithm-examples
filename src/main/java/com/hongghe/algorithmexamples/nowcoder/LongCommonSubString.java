package com.hongghe.algorithmexamples.nowcoder;

import java.util.Arrays;

/**
 * @author: hongghe @date: 2019-03-24 16:12
 */
public class LongCommonSubString {

    public static boolean checkString(String[] strings) {
        boolean flag = false;
        if (strings != null) {
            for (int i=0; i<strings.length; i++) {
                if (strings[i] != null && strings[i].length() != 0) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }
        return flag;
    }

    public static String repalaceSpace(String[] strings) {
        if (!checkString(strings)) {
            return "";
        }

        int len = strings.length;
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.sort(strings);
        int m = strings[0].length();
        int n = strings[len - 1].length();
        int num = Math.min(m,n);
        for (int i=0; i<num; i++) {
            if (strings[0].charAt(i) == strings[len-1].charAt(i)) {
                stringBuilder.append(strings[0].charAt(i));
            } else {
                break;
            }
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {

    }
}
