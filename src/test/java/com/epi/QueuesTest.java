package com.epi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.epi.BinaryTrees.BinaryTreeNode;

public class QueuesTest {
    private Queues queues;

    @Before
    public void setup() {
        queues = new Queues();
    }

    @Test
    public void getBinaryTreeNodesIncreasingDepth() {
        BinaryTreeNode<Integer> root = getCompleteBinaryTree();
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(5));
        expected.add(Arrays.asList(3,8));
        expected.add(Arrays.asList(1,2,7,9));
        List<List<Integer>> actual = queues.getBinaryTreeNodesIncreasingDepth(root);
        Assert.assertTrue(expected.equals(actual));
    }

    /**
     * Returns the following binary tree
     * <pre>
     *
     *                   5
     *                /    \
     *               3      8
     *              /\     / \
     *             1  2   7  9
     * </pre>
     */
    private BinaryTreeNode<Integer> getCompleteBinaryTree() {
        BinaryTreeNode one = new BinaryTreeNode(1, null, null);
        BinaryTreeNode two = new BinaryTreeNode(2, null, null);
        BinaryTreeNode three = new BinaryTreeNode(3, one, two);

        BinaryTreeNode seven = new BinaryTreeNode(7, null, null);
        BinaryTreeNode nine = new BinaryTreeNode(9, null, null);
        BinaryTreeNode eight = new BinaryTreeNode(8, seven, nine);

        BinaryTreeNode root = new BinaryTreeNode(5, three, eight);
        return root;
    }
}