package com.lesson11.easy;
/*
1. Создать массив, содержащий целые числа, размера 10.
2. Заполнить массив случайными числами (класс Random).
3. Создать и запустить побочный поток, вычисляющий максимальное значение массива.
4. Создать и запустить побочный поток, вычисляющий минимальное значение массива.
5. Гланый поток ожидает завершения побочных потоков (можно воспользоваться для этого методом join) и выводит максимум и минимум на консоль.
 */

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10) + 1;
        }
        System.out.println("Array: " + Arrays.toString(array));

        Thread thread1 = new Thread(() -> {
            int max = 0;
            for (int i = 0; i < array.length; i++) {
                if (max < array[i])
                    max = array[i];
            }
            System.out.println("Maximal number in array: " + max);
        });

        Thread thread2 = new Thread(() -> {
            int min = 11;
            for (int i = 0; i < array.length; i++) {
                if (min > array[i])
                    min = array[i];
            }
            System.out.println("Minimal number in array: " + min);
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main thread ends");
    }
}
