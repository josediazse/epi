package com.epi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class BinaryTreesTest {
    private BinaryTrees binaryTrees;

    @Before
    public void setup() {
        binaryTrees = new BinaryTrees();
    }

    @Test
    public void iterativeInOrder() {
        var expected = List.of(1, 3, 2, 5, 7, 8, 9);
        var actual = binaryTrees.iterativeInOrder(BinaryTrees.getCompleteBinaryTree());
        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void iterativePreOrder() {
        var expected = List.of(5, 3, 1, 2, 8, 7, 9);
        var actual = binaryTrees.iterativePreOrder(BinaryTrees.getCompleteBinaryTree());
        Assert.assertTrue(expected.equals(actual));
    }
}