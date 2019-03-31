package com.mprtcz.leetcode.recursivetree.pathfinder;

import com.mprtcz.leetcode.recursivetree.TreeNode;

/**
 * @author mprtcz
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        return visitNode(root, sum, 0);
    }

    public boolean visitNode(TreeNode node, int sum, int currentSum) {
        if (node == null) return false;

        currentSum += node.val;
        if (node.right == null && node.left == null) { // the last node - check the result
            return currentSum == sum;
        }

        return visitNode(node.left, sum, currentSum) ||
                visitNode(node.right, sum, currentSum);
    }
}
