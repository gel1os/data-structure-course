package com.learning.ArraySorting;

import java.util.Arrays;

// O(n^2) complexity
public class ShellSort {
    public static int[] shellSort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j-= gap;
                }
                array[j] = newElement;
            }
        }
        System.out.println("Shell sort:");
        System.out.println(Arrays.toString(array));
        return array;
    }
}
