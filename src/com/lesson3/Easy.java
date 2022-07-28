package com.lesson3;

import java.sql.Time;
import java.util.Scanner;

/*
        Вывести на экран последовательность чисел от 0 до n в обратном порядке
         */
public class Easy {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Задайте величину n");
                int n = scanner.nextInt();

                long before = System.currentTimeMillis();

                for (int i =n; i > 0; i--) {
                    System.out.println(i);
                }
                long after = System.currentTimeMillis();

                System.out.println("Метод main, выполнил задачу за " + (after - before) + " мсек");
            }
        }
