package com.learning;
import com.learning.ArraySorting.*;

public class Main {
    public static void main(String[] args) {
        int[] arrayToSort = { 12, 23, 234, 324, 32, -23, 867, 3, 401, 45, 22, -1, 0, -1, 18, 654 };
        /*BubbleSort.bubbleSort(arrayToSort);
        SelectionSort.selectionSort(arrayToSort);
        InsertionSort.insertionSort(arrayToSort);
        ShellSort.shellSort(arrayToSort);
        MergeSort.mergeSort(arrayToSort);*/
        QuickSort.quickSort(arrayToSort);
    }
}

