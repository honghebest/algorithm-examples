package com.hongghe.algorithmexamples.algorithm.match;

import com.google.gson.Gson;

/**
 * @author: hongghe @date: 2019-01-20 16:15
 */
public class CharMatchMain {

    private static final String NAME_REGEX = "";

    public static void main(String[] args) {
        String headString = "I am good";
        String[] matchString = headString.split(NAME_REGEX);
        System.out.println(new Gson().toJson(matchString));
    }
}
