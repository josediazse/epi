package com.epi;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BinaryTrees {
    public static class BinaryTreeNode<T> {
        public T data;
        public BinaryTreeNode<T> left, right;

        public BinaryTreeNode(T data, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    // 9.07
    public List<Integer> iterativeInOrder(BinaryTreeNode<Integer> root) {
        Objects.requireNonNull(root);
        List<Integer> result = new ArrayList<>();
        var stack = new ArrayDeque<BinaryTreeNode<Integer>>();
        var curr = root;
        while (!stack.isEmpty() || curr != null) {
            if (curr != null) { // going down
                stack.push(curr);
                curr = curr.left;
            } else { // going up
                curr = stack.pop();
                result.add(curr.data);
                curr = curr.right;
            }
        }
        return result;
    }

    // 9.08
    public List<Integer> iterativePreOrder(BinaryTreeNode<Integer> root) {
        Objects.requireNonNull(root);
        var result = new ArrayList<Integer>();
        var stack = new ArrayDeque<BinaryTreeNode<Integer>>();
        stack.push(root);
        while (!stack.isEmpty()) {
            var curr = stack.pop();
            result.add(curr.data);
            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
        return result;
    }

    public void preOrder(BinaryTreeNode<Integer> node) {
        if (node == null) {
            return;
        }
        System.out.println(node);
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * Returns the following binary tree
     * <pre>
     *
     *                    5
     *                 /    \
     *               3       8
     *              /\      / \
     *             1  2    7   9
     * </pre>
     */
    public static BinaryTreeNode<Integer> getCompleteBinaryTree() {
        var one = new BinaryTreeNode(1, null, null);
        var two = new BinaryTreeNode(2, null, null);
        var three = new BinaryTreeNode(3, one, two);

        var seven = new BinaryTreeNode(7, null, null);
        var nine = new BinaryTreeNode(9, null, null);
        var eight = new BinaryTreeNode(8, seven, nine);

        var root = new BinaryTreeNode(5, three, eight);
        return root;
    }
}
