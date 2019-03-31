package com.mprtcz.leetcode.BinaryTree.preorder;


import com.mprtcz.leetcode.BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mprtcz
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();

        visit(root, result);
        return result;
    }

    private void visit(TreeNode root, List<Integer> result) {
        if (root != null) {
            result.add(root.val);
            visit(root.left, result);
            visit(root.right, result);
        }
    }
}