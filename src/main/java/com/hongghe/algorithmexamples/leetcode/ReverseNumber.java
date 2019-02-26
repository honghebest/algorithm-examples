package com.hongghe.algorithmexamples.leetcode;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * @author: hongghe @date: 2019-02-26 20:25
 */
public class ReverseNumber {

    public int reverse(int x) {
        String xStr = String.valueOf(x);
        String result = "";
        for (int i = 0 ;i < xStr.length(); i++){
            char  item =  xStr.charAt(i);
            result = String.valueOf(item) + result;
        }
        if (String.valueOf(result.charAt(result.length()-1)).equals("-")){
            result = result.substring(0,result.length()-1);
            result = "-" + result;
        }
        Long resultLong = Long.valueOf(result);
        if (resultLong> 2147483647L || resultLong< -2147483648L){
            return 0;
        }
        return Integer.valueOf(result) ;
    }

    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        System.out.println(reverseNumber.reverse(-1231231231));
    }
}
