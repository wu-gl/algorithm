package com.example.tree;

import java.util.Comparator;

/**
 * @Description Node
 * @Author 吴桂林
 * @Date 2019/12/28 9:50
 * @Version 1.0
 */
public class Node implements Comparable<Integer> {
    public Node() {

    }

    public Node(int data) {
        this.data = data;
    }

    private Node right;
    private Node left;
    private Integer data;

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    @Override
    public int compareTo(Integer o) {
        return this.data - o;
    }
}
