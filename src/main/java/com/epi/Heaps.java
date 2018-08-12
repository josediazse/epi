package com.epi;

import java.util.*;

public class Heaps {
    public List<Integer> heapSort(List<Integer> list) {
        var heap = new PriorityQueue<Integer>(list.size());
        for (Integer integer : list) {
            heap.add(integer);
        }
        var result = new ArrayList<Integer>();
        while (!heap.isEmpty()) {
            Integer element = heap.poll();
            result.add(element);
        }
        return result;
    }

    public List<Integer> kLargest(int k, List<Integer> list) {
        var minHeap = new PriorityQueue<Integer>(k, Comparator.naturalOrder());
        for (Integer element : list) {
            minHeap.add(element);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return new ArrayList<>(minHeap);
    }

    public List<Integer> kSmallest(int k, List<Integer> list) {
        var maxHeap = new PriorityQueue<Integer>(k, Comparator.reverseOrder());
        for (Integer element : list) {
            maxHeap.add(element);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return new ArrayList<>(maxHeap);
    }

    private static class ArrayEntry {
        Integer value;
        int arrayKey;

        public ArrayEntry(Integer value, int arrayKey) {
            this.value = value;
            this.arrayKey = arrayKey;
        }
    }

    // 10.01
    public List<Integer> mergeSortedLists(List<List<Integer>> sortedLists) {
        Objects.requireNonNull(sortedLists);
        var minHeap = new PriorityQueue<ArrayEntry>(sortedLists.size(), Comparator.comparing(a -> a.value));
        var iterators = new ArrayList<Iterator<Integer>>();
        for (List<Integer> sortedList : sortedLists) {
            iterators.add(sortedList.iterator());
        }
        for (int i = 0; i < iterators.size(); i ++) {
            minHeap.add(new ArrayEntry(iterators.get(i).next(), i));
        }
        var result = new ArrayList<Integer>();
        ArrayEntry curr;
        while (!minHeap.isEmpty()) {
            curr = minHeap.poll();
            result.add(curr.value);
            if (iterators.get(curr.arrayKey).hasNext()) {
                minHeap.add(new ArrayEntry(iterators.get(curr.arrayKey).next(), curr.arrayKey));
            }
        }
        return result;
    }
}
