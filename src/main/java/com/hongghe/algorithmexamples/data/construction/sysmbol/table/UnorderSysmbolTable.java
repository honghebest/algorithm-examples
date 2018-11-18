package com.hongghe.algorithmexamples.data.construction.sysmbol.table;

/**
 * @author hongghe 2018/8/24
 */
public interface UnorderSysmbolTable<Key, Value> {

    int size();

    Value get(Key key);

    void put(Key key, Value value);

    void delete(Key key);
}
