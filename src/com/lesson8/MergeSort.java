package com.lesson8;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 4 , 2, 1};
        System.out.println(Arrays.toString(numbers));
        mergeSort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(numbers));
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (right <= left) {
            return;
        }

        int mid = (left + right) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    private static void merge(int[] array, int left, int mid, int right) {
        // ��������� �����
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        // ������� ��������� ����������
        int leftArray[] = new int[lengthLeft];
        int rightArray[] = new int[lengthRight];

        // �������� ��������������� ������� �� ���������
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left + i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid + i + 1];

        // ��������� �������� ������� ������ ���������� ����������
        int leftIndex = 0;
        int rightIndex = 0;

        // �������� �� leftArray � rightArray ������� � ������
        for (int i = left; i < right + 1; i++) {
            // ���� �������� ��������������� �������� � R � L, �������� �����������
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // ���� ��� �������� ���� ����������� �� rightArray, ����������� ��������� �� leftArray
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // ���� ��� �������� ���� ����������� �� leftArray, ����������� ��������� �� rightArray
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}
