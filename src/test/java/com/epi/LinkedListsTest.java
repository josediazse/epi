package com.epi;

import org.junit.Before;
import org.junit.Test;

import static com.epi.LinkedLists.ListNode;
import static org.junit.Assert.assertTrue;

public class LinkedListsTest {
    LinkedLists linkedLists;

    @Before
    public void setUp() {
        linkedLists = new LinkedLists();
    }

    @Test
    public void mergeTwoSortedLists() {
        ListNode<Integer> L1 = getListFromElements(1, 3, 5, 8);
        ListNode<Integer> L2 = getListFromElements(2, 4, 4, 7, 10, 12);
        ListNode<Integer> expected = getListFromElements(1, 2, 3, 4, 4, 5, 7, 8, 10, 12);
        ListNode<Integer> actual = linkedLists.mergeTwoSortedLists(L1, L2);
        assertTrue("Lists are different", assertListEquals(expected, actual));
    }

    @Test
    public void reverseLinkedList() {
        ListNode<Integer> actual = linkedLists.reverseLinkedList(getListFromElements(4, 2, 6, 9));
        assertTrue("Lists are different", assertListEquals(getListFromElements(9, 6, 2, 4), actual));
    }

    private boolean assertListEquals(ListNode<Integer> l1, ListNode<Integer> l2) {
        while (l1 != null && l2 != null) {
            if (l1.data != l2.data) return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }

    private ListNode<Integer> getListFromElements(Integer... elements) {
        ListNode<Integer> head = new ListNode<>(0, null);
        ListNode<Integer> current = head;
        for (Integer element : elements) {
            current.next = new ListNode<>(element, null);
            current = current.next;
        }
        return head.next;
    }

    private void printList(ListNode<Integer> l1) {
        while (l1 != null) {
            System.out.print(l1.data);
            l1 = l1.next;
        }
        System.out.println();
    }
}