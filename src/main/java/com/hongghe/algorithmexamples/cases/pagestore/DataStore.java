package com.hongghe.algorithmexamples.cases.pagestore;

import javax.annotation.PostConstruct;

/**
 * 数据的存储的设计模式
 *
 * @author hongghe 2018/9/8
 */
public class DataStore {

    public DataStore() {}

    @PostConstruct
    public void init() {
        System.out.println("The first step for operating.");
    }
}
