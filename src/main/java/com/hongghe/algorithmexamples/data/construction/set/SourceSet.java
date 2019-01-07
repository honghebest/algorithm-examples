package com.hongghe.algorithmexamples.data.construction.set;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author: hongghe @date: 2019-01-06 17:09
 */
@Slf4j
public class SourceSet {

    public static void setFunction() {
        Set<String> set = new TreeSet<String>();
    }

    public static void main(String[] args) {
        SetEntity setEntity = new SetEntity();
        setEntity.setName("name");
        log.info("setEntity = {}", new Gson().toJson(setEntity));
    }
}
