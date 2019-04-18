package com.hongghe.algorithmexamples.algorithm.chars;

import java.util.Stack;

/**
 * @author: hongghe @date: 2019-04-18 09:46
 */
public class ReverseString {

    public static void main(String[] args) {
        reverse("hello");
    }

    /**
     * 直接遍历反转
     *
     * @param text
     * @return
     */
    public static String directRevers(String text) {
        if (text == null || text.length() ==  0)
            return text;
        int length = text.length();
        char[] array = text.toCharArray();
        for (int i=0; i<length; i++) {
            array[i] = text.charAt(length-1-i);
        }
        return new String(array);
    }

    /**
     * 双向遍历反转
     *
     * @param text
     * @return
     */
    public static String reverse(String text) {
        if (text == null || text.length() == 0)
            return text;
        int length = text.length();
        char[] array = text.toCharArray();
        for (int i=0; i<length/2; i++) {
            array[i] = text.charAt(length-1-i);
            array[length-1-i] = text.charAt(i);
        }
        System.out.println(new String(array));
        return new String(array);
    }

    /**
     * 栈反转
     *
     * @param text
     * @return
     */
    public static String stackReverse(String text) {
        if (text == null || text.length() == 0)
            return text;
        Stack<Character> stack = new Stack<>();
        char[] array = text.toCharArray();
        for (Character character : array) {
            stack.push(character);
        }
        int length = text.length();
        for (int i=0; i<length; i++) {
            array[i] = stack.pop();
        }
        return new String(array);
    }

    /**
     * 逆序反转
     *
     * @param text
     * @return
     */
    public static String reverseWithReverseLoop(String text) {
        if (text == null || text.length() == 0)
            return text;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<text.length(); i++) {
            stringBuilder.append(text.charAt(i));
        }
        return stringBuilder.toString();
    }

    /**
     * 位反转
     *
     * @param text
     * @return
     */
    public static String reverseWithXor(String text) {
        if (text == null || text.length() == 0)
            return text;
        char[] array = text.toCharArray();
        int length = text.length();
        for (int i=0; i<length; i++,length--) {
            array[i]^=array[length];
            array[length]^=array[i];
            array[i]^=array[length];
        }
        return new String(array);
    }

    /**
     * 递归反转
     * 
     * @param text
     * @return
     */
    public static String reverseWithRecursive(String text) {
        if (text == null || text.length() == 0)
            return text;
        int length = text.length();
        if (length == 1) {
            return text;
        } else {
            return reverseWithRecursive(text.substring(1) + text.charAt(0));
        }
    }
}
