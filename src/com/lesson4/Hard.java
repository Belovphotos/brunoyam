package com.lesson4;

import java.util.Arrays;
import java.util.Random;

public class Hard {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("New array without sort: " + Arrays.toString(array));

//        Arrays.sort(array);
//
//        System.out.println("Array sorted by method \"sort\": " + Arrays.toString(array));

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted by loop: " + Arrays.toString(array));
    }
}
