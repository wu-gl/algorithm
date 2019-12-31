package com.company;

import java.util.Arrays;

public class SelectSortMain {

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 9, 1, 5, 7, 6, 8};

        for (int i = 0; i < arr.length - 1; i++) {
            int  min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int tmp = arr[min];
                arr[min] = arr[i];
                arr[i] = tmp;
            }
        }


        System.out.print(Arrays.toString(arr));

        // write your code here
    }
}
