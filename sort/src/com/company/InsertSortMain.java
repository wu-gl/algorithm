package com.company;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class InsertSortMain {

    public static volatile int a = 0;

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 9, 1, 5, 7, 6, 8};

        if (arr == null || arr.length < 2) {
            return;
        }
        TimeUnit.MINUTES.sleep(100);
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int index = -1;
            for (int j = i; j > 0; j--) {
                if (temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    index = j - 1;
                }
            }
            if (index != -1) {
                arr[index] = temp;
            }
        }

        System.out.print(Arrays.toString(arr));

        // write your code here
    }
}
