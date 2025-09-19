import interfaces.Sort;
import usecases.MergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort sorter = new MergeSort();
        int[] arr = {38, 27, 43, 10};
        sorter.sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
