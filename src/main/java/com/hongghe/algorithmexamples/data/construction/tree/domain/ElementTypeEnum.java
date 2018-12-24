package com.hongghe.algorithmexamples.data.construction.tree.domain;

/**
 * @author hongghe 2018/12/24
 */
public enum  ElementTypeEnum {

    /**
     * 整型
     */
    INTEGER_TYPE(0),

    /**
     * 字符串类型
     */
    STRING_TYPE(1),
    ;

    private Integer type;

    ElementTypeEnum(Integer type) {
        this.type = type;
    }
}
