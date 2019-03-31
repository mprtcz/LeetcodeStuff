package com.mprtcz.leetcode.BinaryTree.postorder;

import com.mprtcz.leetcode.BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mprtcz
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();

        visit(root, result);
        return result;
    }

    private void visit(TreeNode root, List<Integer> result) {
        if (root != null) {
            visit(root.left, result);
            visit(root.right, result);
            result.add(root.val);
        }
    }
}