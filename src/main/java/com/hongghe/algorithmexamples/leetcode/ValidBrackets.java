package com.hongghe.algorithmexamples.leetcode;

import java.util.Stack;

/**
 * @author honghe zhang
 * @date 2020/06/22
 */
public class ValidBrackets {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            stack.push(s.charAt(i));
        }
        return false;
    }

    public static void main(String[] args) {
        isValid("()[]{}");
    }
}
