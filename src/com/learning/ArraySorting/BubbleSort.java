package com.learning.ArraySorting;

import java.util.Arrays;

// O(n^2) complexity
public class BubbleSort {
    private static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] bubbleSort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i+1]) {
                    swap(array, i, i+1);
                }
            }
        }
        System.out.println("Bubble sort:");
        System.out.println(Arrays.toString(array));
        return array;
    }
}
