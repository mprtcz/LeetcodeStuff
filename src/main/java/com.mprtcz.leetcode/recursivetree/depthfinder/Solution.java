package com.mprtcz.leetcode.recursivetree.depthfinder;

import com.mprtcz.leetcode.recursivetree.TreeNode;

/**
 * @author mprtcz
 */
public class Solution {

    public int maxDepth(TreeNode root) {
        return visitNode(root, 0);
    }

    public int visitNode(TreeNode node, int depth) {
        if (node == null) return depth;
        depth++;

        int leftResult = visitNode(node.left, depth);
        int rightResult =  visitNode(node.right, depth);

        return leftResult > rightResult ? leftResult: rightResult;
    }
}
