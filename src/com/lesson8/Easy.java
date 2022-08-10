package com.lesson8;

import java.util.Arrays;

public class Easy {
    public static void main(String[] args) {
        int[] array = {3,2,5,4,1};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int position = i;
            int minElement = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minElement) {
                    position = j;
                    minElement = array[j];
                }
            }
            array[position] = array[i];
            array[i] = minElement;
        }
        System.out.println(Arrays.toString(array));
    }
}
