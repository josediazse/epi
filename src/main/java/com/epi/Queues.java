package com.epi;

import java.util.ArrayDeque;
import java.util.ArrayList;

import static com.epi.BinaryTrees.BinaryTreeNode;

public class Queues {
    // 8.6
    public ArrayList<ArrayList<Integer>> getBinaryTreeNodesIncreasingDepth(BinaryTreeNode<Integer> root) {
        var result = new ArrayList<ArrayList<Integer>>();
        var currDepth = new ArrayDeque<BinaryTreeNode<Integer>>();
        currDepth.add(root);
        while (!currDepth.isEmpty()) {
            var nextDepth = new ArrayDeque<BinaryTreeNode<Integer>>();
            var r = new ArrayList<Integer>();
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
