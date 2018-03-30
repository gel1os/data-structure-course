package com.learning.ArraySorting;

import java.util.Arrays;

// O(n^2) complexity
public class InsertionSort {
    public static int[] insertionSort(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i-1];
            }
            array[i] = newElement;
        }
        System.out.println("Insertion sort:");
        System.out.println(Arrays.toString(array));
        return array;
    }
}
