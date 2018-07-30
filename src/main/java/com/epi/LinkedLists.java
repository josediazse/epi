package com.epi;

public class LinkedLists {
    public static class ListNode<T> {
        T data;
        ListNode<T> next;

        public ListNode(T data, ListNode<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    public ListNode<Integer> mergeTwoSortedLists(ListNode<Integer> L1, ListNode<Integer> L2) {
        ListNode<Integer> head = new ListNode<>(0, null);
        ListNode<Integer> current = head;
        while (L1 != null && L2 != null) {
            if (L1.data <= L2.data) {
                current.next = L1;
                L1 = L1.next;
            } else {
                current.next = L2;
                L2 = L2.next;
            }
            current = current.next;
        }
        current.next = L1 != null ? L1 : L2;
        return head.next;
    }
}
