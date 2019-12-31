package com.example.tree;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @Description 二叉排序树
 * @Author 吴桂林
 * @Date 2019/12/28 9:51
 * @Version 1.0
 */
public class TwoForkTree {
    private Node rootNode = null;

    /**
     * 新增
     *
     * @param data 数据
     */
    public void add(int data) {
        if (rootNode == null) {
            rootNode = new Node(data);
        } else {
            add(data, rootNode);
        }
    }


    private void add(int data, Node root) {
        int c = root.compareTo(data);
        if (c > 0) {
            if (root.getLeft() == null) {
                root.setLeft(new Node(data));
            } else {
                add(data, root.getLeft());
            }
        }
        if (c < 0) {
            if (root.getRight() == null) {
                root.setRight(new Node(data));
            } else {
                add(data, root.getRight());
            }
        }
    }

    /**
     * 查找
     *
     * @param data 数据
     */
    public Node find(int data) throws Exception {
        return find(data, rootNode);
    }

    private Node find(int data, Node root) {
        if (root == null) {
            return null;
        }
        int d = root.compareTo(data);
        if (d == 0) {
            return root;
        } else if (d > 0) {
            return find(data, root.getLeft());
        } else {
            return find(data, root.getRight());
        }
    }

    /*
     *  前序遍历
     *  根结点 ---> 左子树 ---> 右子树
     */
    public void printb() {
        System.out.println("前序遍历：");
        printb(rootNode);
        System.out.println();
    }

    private void printb(Node root) {
        if (root != null) {
            System.out.print(root.getData() + "  ");
            printb(root.getLeft());
            printb(root.getRight());
        }
    }


    /*
     *  中序遍历
     *  根结点 ---> 左子树 ---> 右子树
     */
    public void printm() {
        System.out.println("中序遍历：");
        printm(rootNode);
        System.out.println();
    }

    private void printm(Node root) {
        if (root != null) {
            printm(root.getLeft());
            System.out.print(root.getData() + "  ");
            printm(root.getRight());
        }
    }


    /*
     *  后序遍历
     *  左子树 ---> 右子树 ---> 根结点
     */
    public void printa() {
        System.out.println("后序遍历：");
        printa(rootNode);
        System.out.println();
    }

    private void printa(Node root) {
        if (root != null) {
            printa(root.getLeft());
            printa(root.getRight());
            System.out.print(root.getData() + "  ");
        }
    }


    /*
     *  层次遍历
     *  左子树 ---> 右子树 ---> 根结点
     */
    public void printl() {
        System.out.println("层次遍历：");
        printl(rootNode);
        System.out.println();
    }

    public void printl(Node root) {
        if (root == null) {
            return;
        }
        LinkedList<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.getData() + "  ");
            if (node.getLeft() != null) {
                queue.offer(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.offer(node.getRight());
            }
        }
    }
}
