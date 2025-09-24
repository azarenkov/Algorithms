import interfaces.Sort;
import usecases.MergeSort;
import usecases.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort mergeSorter = new MergeSort();
        Sort quickSorter = new QuickSort();

        int[] arr = {38, 27, 43, 10};
        mergeSorter.sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array by merge sort: " + Arrays.toString(arr));

        int[] arr2 = {38, 27, 43, 10};
        quickSorter.sort(arr2, 0, arr2.length - 1);
        System.out.println("Sorted array by quick sort: " + Arrays.toString(arr2));

    }
}
