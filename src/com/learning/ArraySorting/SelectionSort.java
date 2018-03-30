package com.learning.ArraySorting;

import java.util.Arrays;

// O(n^2) complexity
public class SelectionSort {
    private static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] selectionSort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int indexOfLargest = 0;
            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[indexOfLargest]) {
                    indexOfLargest = i;
                }
                swap(array, indexOfLargest, lastUnsortedIndex);
            }
        }
        System.out.println("Selection sort:");
        System.out.println(Arrays.toString(array));
        return array;
    }
}
