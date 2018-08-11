package com.epi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
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
        var root = getCompleteBinaryTree();
        var expected = new ArrayList<>();
        expected.add(List.of(5));
        expected.add(List.of(3,8));
        expected.add(List.of(1,2,7,9));
        var actual = queues.getBinaryTreeNodesIncreasingDepth(root);
        Assert.assertTrue(expected.equals(actual));
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
    private BinaryTreeNode<Integer> getCompleteBinaryTree() {
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