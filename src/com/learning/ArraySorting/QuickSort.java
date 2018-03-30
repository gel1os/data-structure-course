package com.learning.ArraySorting;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] input) {
        runSorting(input, 0, input.length);
        System.out.println("Quick sort:");
        System.out.println(Arrays.toString(input));
    }

    private static void runSorting(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        runSorting(input, start, pivotIndex);
        runSorting(input, pivotIndex + 1, end);
    }

    private static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            if (input[--j] >= pivot) {
               input[i] = input[j];
            }

            if (input[--i] <= pivot) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }
}
