package com.lesson4;

import java.util.Arrays;
import java.util.Random;

public class Easy {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[12];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(31);
        }
        System.out.println(Arrays.toString(array));

        int maxElement = 0;
        int indexOfMaxElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxElement < array[i]){
                maxElement = array[i];
                indexOfMaxElement = i;
            }
        }
        System.out.println("Maximal element: " + maxElement);
        System.out.println("Index of maximal element: " + indexOfMaxElement);
    }
}
