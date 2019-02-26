package com.hongghe.algorithmexamples.leetcode;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * @author: hongghe @date: 2019-02-26 20:25
 */
public class ReverseNumber {

    public int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder();
        int z = -1;
        if (x > 0) {
            z = 1;
        } else {
            x = (z)*x;
        }

        while (x/10 > 0) {
            int y = x%10;
            stringBuilder.append(y);
            x = x/10;
        }
        stringBuilder.append(x);
        int ret = 0;
        try {
            ret = Integer.valueOf(stringBuilder.toString());
        } catch (Exception e) {
            return ret;
        }
        return (z)*Integer.valueOf(stringBuilder.toString());
    }

    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        System.out.println(reverseNumber.reverse(-123));
    }
}
