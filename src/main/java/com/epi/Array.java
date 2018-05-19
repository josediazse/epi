package com.epi;

import java.util.Collections;
import java.util.List;

public class Array {
    public void evenOdd(List<Integer> a) {
        int nextEven = 0, nextOdd = a.size() - 1;
        while (nextEven < nextOdd) {
            if (a.get(nextEven) % 2 == 0) {
                nextEven++;
            } else {
                Collections.swap(a, nextEven, nextOdd--);
            }
        }
    }

    public void quickSort(int[] a) {
        quicksort(a, 0, a.length - 1);
    }

    private void quicksort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = a[(left + right) / 2];
        int index = partition(a, left, right, pivot);
        quicksort(a, left, index - 1);
        quicksort(a, index, right);
    }

    private int partition(int[] a, int left, int right, int pivot) {
        while (left <= right) {
            while (a[left] < pivot) {
                left++;
            }
            while (a[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(a, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    // 5.01
    public void dutchNationalFlagPartitionBF(int[] array, int i) {

    }
}
