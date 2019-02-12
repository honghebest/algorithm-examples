package com.hongghe.algorithmexamples.data.construction.set;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: hongghe @date: 2019-01-06 17:09
 */
@Slf4j
public class SourceSet {

    public static void main(String[] args) {
        SetEntity setEntity = new SetEntity();
        setEntity.setName("name");
        log.info("setEntity = {}", setEntity.toString());
    }
}
