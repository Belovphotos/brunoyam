package com.lesson3;

import java.sql.Time;
import java.util.Scanner;

/*
        ������� �� ����� ������������������ ����� �� 0 �� n � �������� �������
         */
public class Easy {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("������� �������� n");
                int n = scanner.nextInt();

                long before = System.currentTimeMillis();

                for (int i =n; i > 0; i--) {
                    System.out.println(i);
                }
                long after = System.currentTimeMillis();

                System.out.println("����� main, �������� ������ �� " + (after - before) + " ����");
            }
        }
