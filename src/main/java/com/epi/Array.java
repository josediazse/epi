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
    public void dutchNationalFlagPartition(int[] array, int p) {
        int pivot = array[p], less = 0, more = array.length - 1, equal = 0;
        while (equal <= more) {
            if (array[equal] == pivot)
                equal++;
            else if (array[equal] < pivot)
                swap(array, equal++, less++);
            else
                swap(array, equal, more--);
        }
    }

    // 5.02
    public int[] plusOne(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 9 && i == 0) {
                return getResizedArray(array);
            }
            if (array[i] == 9) {
                array[i] = 0;
                continue;
            }
            array[i]++;
            break;
        }
        return array;
    }

    private int[] getResizedArray(int[] array) {
        int[] newArray = new int[array.length + 1];
        newArray[0] = 1;
        return newArray;
    }

    // 5.06
    public int computeMaxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, maxProfit = 0;
        for (int price : prices) {
            maxProfit = Math.max(maxProfit, price - min);
            min = Math.min(min, price);
        }
        return maxProfit;
    }
}
