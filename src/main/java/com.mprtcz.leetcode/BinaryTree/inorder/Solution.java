package com.mprtcz.leetcode.BinaryTree.inorder;

import com.mprtcz.leetcode.BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mprtcz
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();

        visit(root, result);
        return result;
    }

    private void visit(TreeNode root, List<Integer> result) {
        if (root != null) {
            visit(root.left, result);
            result.add(root.val);
            visit(root.right, result);
        }
    }
}