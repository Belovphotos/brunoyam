package com.lesson3;
/*
������� ������������������ ��������� �� n.
���������, ��� �� ���� ������������ ��� ���������.
 */

import java.util.Scanner;

public class Hard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� N �����  ��������� : ");
        int N = scanner.nextInt();
        if(N == 0){
            System.out.println("������� ������������������");
        } else {
            int num1 = 1;
            int num2 = 1;
            int nums;
            System.out.println(num1);
            System.out.println(num2);
            for (int i = 0; i < (N - 2); i++) {
                nums = num1 + num2;
                num1 = num2;
                num2 = nums;
                System.out.println(nums);
            }
        }
    }
}
