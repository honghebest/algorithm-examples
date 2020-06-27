package com.hongghe.algorithmexamples.data.construction.link;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hongghe 2018/8/21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Node {
    public Object element;
    public Node front;
    public Node back;
}
