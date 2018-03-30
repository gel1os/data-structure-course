package com.learning.ArraySorting;

import java.util.Arrays;

// O(nlogn) complexity
public class MergeSort {
    public static void mergeSort(int[] input) {
        runSorting(input, 0, input.length);
        System.out.println("Merge sort:");
        System.out.println(Arrays.toString(input));
    }

    private static void runSorting(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        runSorting(input, start, mid);
        runSorting(input, mid, end);
        merge(input, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end) {
        if (input[mid-1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
