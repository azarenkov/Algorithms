package usecases;

import interfaces.Select;

import java.util.ArrayList;
import java.util.Arrays;

public final class DeterministicSelect implements Select {

    public int select(int[] arr, int k) {
        if (k > arr.length) throw new IllegalArgumentException();
        if (arr.length == 0) return Integer.MIN_VALUE;
        return select(arr, k, 0, arr.length - 1);
    }

    private int select(int[] arr, int k, int start, int end) {
        var pivot = findPivot(arr,start,end);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == pivot) swap(arr, i, arr.length - 1);
        }
        var pivotIndex = partition(arr, 0,arr.length - 1);
        if (k == pivotIndex + 1) return arr[pivotIndex];
        else if (k <= pivotIndex) return select(arr, k, start, pivotIndex - 1);
        else return select(arr, k, pivotIndex + 1, end);
    }

    private int findPivot(int[] arr, int start, int end) {
        ArrayList<Integer> medians = new ArrayList<>();
        int length = end + 1 - start;
        if (length <= 5) return findMedian(Arrays.copyOfRange(arr, start, end + 1), length % 5);
        int i;
        for (i = start; end + 1 - i > 5; i += 5) {
            if (i + 5 > end + 1) {
                break;
            }

            int median = findMedian(Arrays.copyOfRange(arr, i, i + 5),5);
            medians.add(median);
        }
        if (length % 5 != 0) medians.add(findMedian(Arrays.copyOfRange(arr, i, end + 1),length % 5));
        int[] medianArr = toArray(medians);
        return findPivot(medianArr, 0,medianArr.length);
    }

    private int[] toArray(ArrayList<Integer> list) {
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    private int findMedian(int[] arr, int length) {
        if (arr.length == 1) return arr[0];
        Arrays.sort(arr);
        return arr[length/2];
    }

    private int partition(int[] arr, int start, int end) {
        int i, b = start - 1;
        for (i = start; i <= end; i++) {
            if (arr[i] <= arr[end]) {
                b++;
                swap(arr,i,b);
            }
        }
        return b;
    }

    private void swap(int[] arr, int index1, int index2) {
        int inter = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = inter;
    }

}