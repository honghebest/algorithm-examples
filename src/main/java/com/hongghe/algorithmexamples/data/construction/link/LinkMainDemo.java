package com.hongghe.algorithmexamples.data.construction.link;

import com.google.gson.Gson;

/**
 * @author: hongghe @date: 2019-01-19 17:23
 */
public class LinkMainDemo {

    public static void main(String[] args) {
        System.out.println(new Gson().toJson(new Node()));
    }
}
