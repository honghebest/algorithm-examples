package com.hongghe.algorithmexamples.data.construction.sysmbol.table;

import java.util.List;

/**
 * @author hongghe 2018/8/24
 */
public interface OrderSymbolTable<Key extends Comparable<Key>, Value> {

    int size();

    void put(Key key, Value value);

    Value get(Key key);

    Key min();

    Key max();

    int rank(Key key);

    List<Key> keys(Key k1, Key k2);
}
