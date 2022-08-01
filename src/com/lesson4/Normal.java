package com.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Normal {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(81) + 20;
        }
        System.out.println("New massive: " + Arrays.toString(array));
        System.out.println("¬ведите число из массива");

        int index = -1;

        while (index == -1) {
            int inputNumber = scanner.nextInt();
            for (int i = 0; i < array.length; i++) {
                if (inputNumber == array[i]) {
                    index = i;
                    System.out.println("Index vybrannogo chisla: " + index);
                }
            }
            if (index == -1) {
                System.out.println("Massiv ne soderzhit dannoe chislo, try again");
            }
        }
    }
}

