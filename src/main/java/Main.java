import interfaces.Select;
import interfaces.Sort;
import usecases.DeterministicSelect;
import usecases.MergeSort;
import usecases.QuickSort;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Sort mergeSorter = new MergeSort();
        Sort quickSorter = new QuickSort();
        Select deterministicSelect = new DeterministicSelect();

        int[] arr = {38, 27, 43, 10};
        mergeSorter.sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array by merge sort: " + Arrays.toString(arr));

        int[] arr2 = {38, 27, 43, 10};
        quickSorter.sort(arr2, 0, arr2.length - 1);
        System.out.println("Sorted array by quick sort: " + Arrays.toString(arr2));

        int[] arr3 = {38, 27, 43, 10};
        int selectResult = deterministicSelect.select(arr3, 3);
        System.out.println("Select result: " + selectResult);

    }
}


