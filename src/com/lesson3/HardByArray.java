package com.lesson3;
/*
������� ������������������ ��������� �� n.
���������, ��� �� ���� ������������ ��� ���������.
 */

import java.util.Scanner;

public class HardByArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("������� N ����� ���������");

        int N = scanner.nextInt();

        int[] array = new int[N];
        array[0] = 0;
        array[1] = 1;
        System.out.println(array[0]);
        System.out.println(array[1]);

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i -1] + array[i - 2];
            System.out.println(array[i]);
        }

    }
}
