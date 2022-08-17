package com.lesson11.easy;
/*
1. ������� ������, ���������� ����� �����, ������� 10.
2. ��������� ������ ���������� ������� (����� Random).
3. ������� � ��������� �������� �����, ����������� ������������ �������� �������.
4. ������� � ��������� �������� �����, ����������� ����������� �������� �������.
5. ������ ����� ������� ���������� �������� ������� (����� ��������������� ��� ����� ������� join) � ������� �������� � ������� �� �������.
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
