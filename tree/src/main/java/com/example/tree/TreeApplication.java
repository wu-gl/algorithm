package com.example.tree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;
import java.util.TreeSet;

public class TreeApplication {

    public static void main(String[] args) throws Exception {
        TwoForkTree twoForkTree = new TwoForkTree();
        int[] datas = {5, 2, 3, 4, 5, 9, 1, 26, 8, 22, 12};
        for (int data : datas) {
            twoForkTree.add(data);
        }
        twoForkTree.printb();
        twoForkTree.printm();
        twoForkTree.printa();
        twoForkTree.printl();

        twoForkTree.delete(22);

        Node node = twoForkTree.find(12);
        System.out.println(node == null ? "未找到" : node.getData());

        TwoForkSortTree twoForkSortTree = new TwoForkSortTree();
        Random r = new Random(1);
        for (int i = 0; i < 100; i++) {
            int ran1 = r.nextInt(100);
            twoForkSortTree.add(ran1);
        }
        twoForkSortTree.printm();

//        TwoForkBalanceTree twoForkBalanceTree = new TwoForkBalanceTree();
////        Random r = new Random(1);
////        for (int i = 0; i < 20; i++) {
////            int ran1 = r.nextInt(100);
////            twoForkBalanceTree.put(ran1);
////        }
//        int[] datas = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        for (int data : datas) {
//            twoForkBalanceTree.put(data);
//        }
//        twoForkBalanceTree.print();


    }

}
