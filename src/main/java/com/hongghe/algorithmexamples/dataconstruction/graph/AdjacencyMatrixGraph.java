package com.hongghe.algorithmexamples.dataconstruction.graph;

import java.util.ArrayList;

/**
 * @author hongghe 2018/8/26
 */
public class AdjacencyMatrixGraph {

    /** 存储点的链表*/
    private ArrayList vertexList;
    /** 邻接矩阵，用来存储边*/
    private int[][] edges;
    /** 边的数目*/
    private int edgeNumber;

    public AdjacencyMatrixGraph(int n) {
        edges = new int[n][n];
        vertexList = new ArrayList(n);
        edgeNumber = 0;
    }

    /**
     * 点数
     *
     * @return
     */
    public int getEdgeNumber() {
        return edgeNumber;
    }

    /**
     * 边
     *
     * @return
     */
    public int getNumberOfVertex() {
        return vertexList.size();
    }

    /**
     * 获取节点值
     *
     * @param i
     * @return
     */
    public Object getValueByIndex(int i) {
        return vertexList.get(i);
    }

    /**
     * 返回v1,v2的权值
     *
     * @param v1
     * @param v2
     * @return
     */
    public int getWeight(int v1,int v2) {
        return edges[v1][v2];
    }

    /**
     * 插入结点
     *
     * @param vertex
     */
    public void insertVertex(Object vertex) {
        vertexList.add(vertexList.size(),vertex);
    }

    /**
     * 插入结点
     *
     * @param v1
     * @param v2
     * @param weight
     */
    public void insertEdge(int v1,int v2,int weight) {
        edges[v1][v2]=weight;
        edgeNumber++;
    }

    /**
     * 删除结点
     *
     * @param v1
     * @param v2
     */
    public void deleteEdge(int v1,int v2) {
        edges[v1][v2]=0;
        edgeNumber--;
    }

    /**
     * 得到第一个邻接结点的下标
     *
     * @param index
     * @return
     */
    public int getFirstNeighbor(int index) {
        for(int j=0;j<vertexList.size();j++) {
            if (edges[index][j]>0) {
                return j;
            }
        }
        return -1;
    }


    /**
     * 根据前一个邻接结点的下标来取得下一个邻接结点
     *
     * @param v1
     * @param v2
     * @return
     */
    public int getNextNeighbor(int v1,int v2) {
        for (int j=v2+1;j<vertexList.size();j++) {
            if (edges[v1][j]>0) {
                return j;
            }
        }
        return -1;
    }
}
