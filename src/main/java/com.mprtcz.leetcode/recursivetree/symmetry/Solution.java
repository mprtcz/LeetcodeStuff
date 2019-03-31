package com.mprtcz.leetcode.recursivetree.symmetry;

import com.mprtcz.leetcode.recursivetree.TreeNode;

/**
 * @author mprtcz
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) return true;

        if (leftNode == null || rightNode == null) return false;

        if (leftNode.val == rightNode.val) {
            return isMirror(leftNode.left, rightNode.right) && isMirror
                    (leftNode.right, rightNode.left);
        }
        return false;
    }
}