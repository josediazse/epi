package com.epi;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import static com.epi.BinaryTrees.*;

public class Queues {
    // 8.6
    public List<List<Integer>> getBinaryTreeNodesIncreasingDepth(BinaryTreeNode<Integer> root) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<BinaryTreeNode<Integer>> currDepth = new ArrayDeque<>();
        currDepth.add(root);
        while (!currDepth.isEmpty()) {
            Deque<BinaryTreeNode<Integer>> nextDepth = new ArrayDeque<>();
            List<Integer> r = new ArrayList<>();
            while (!currDepth.isEmpty()) {
                BinaryTreeNode<Integer> node = currDepth.poll();
                r.add(node.data);
                if (node.left != null) {
                    nextDepth.add(node.left);
                }
                if (node.right != null) {
                    nextDepth.add(node.right);
                }
            }
            result.add(r);
            currDepth = nextDepth;
        }
        return result;
    }
}
