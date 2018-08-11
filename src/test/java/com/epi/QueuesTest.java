package com.epi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QueuesTest {
    private Queues queues;

    @Before
    public void setup() {
        queues = new Queues();
    }

    @Test
    public void getBinaryTreeNodesIncreasingDepth() {
        var expected = new ArrayList<>();
        expected.add(List.of(5));
        expected.add(List.of(3,8));
        expected.add(List.of(1,2,7,9));
        var actual = queues.getBinaryTreeNodesIncreasingDepth(BinaryTrees.getCompleteBinaryTree());
        Assert.assertTrue(expected.equals(actual));
    }
}