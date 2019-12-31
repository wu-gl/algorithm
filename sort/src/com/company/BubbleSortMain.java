package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortMain {

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 9, 1, 5, 7, 6, 8};

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print(Arrays.toString(arr));

        // write your code here
    }
}
