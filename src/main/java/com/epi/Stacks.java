package com.epi;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class Stacks {
    // 8.1
    public static class Stack<E extends Comparable<E>> {
        private Deque<E> elements;
        private static final int MIN_INITIAL_CAPACITY = 8;
        public Stack() {
            elements = new ArrayDeque<>(MIN_INITIAL_CAPACITY);
        }

        public void push(E e) {
            elements.push(e);
        }

        public E pop() {
            return elements.pop();
        }

        public E peek() {
            return elements.peek();
        }

        public E max() {
            return Collections.max(elements);
        }
    }
}
