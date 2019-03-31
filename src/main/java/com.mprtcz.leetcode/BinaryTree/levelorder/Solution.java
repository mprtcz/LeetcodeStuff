package com.mprtcz.leetcode.BinaryTree.levelorder;

import com.mprtcz.leetcode.BinaryTree.TreeNode;

import java.util.*;

/**
 * @author mprtcz
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> kueue = new LinkedList<TreeNode>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        kueue.add(root);
        TreeNode startNewWith = root;
        List<Integer> level = new ArrayList<Integer>();

        while (!kueue.isEmpty()) {
            TreeNode node = kueue.remove();
            if (node == null) return new ArrayList<List<Integer>>();
            if (node.left != null) kueue.add(node.left);
            if (node.right != null) kueue.add(node.right);


            if (node == startNewWith) {
                if (!level.isEmpty()) {
                    result.add(level);
                }
                level = new ArrayList<Integer>();

                TreeNode temp = startNewWith;
                if (node.right != null) startNewWith = node.right;
                if (node.left != null) startNewWith = node.left;

                if (!kueue.isEmpty()) {
                    Iterator<TreeNode> iterator = kueue.iterator();
                    while (temp == startNewWith && iterator.hasNext()) {
                        TreeNode next = iterator.next();
                        if (next.right != null) startNewWith = next.right;
                        if (next.left != null) startNewWith = next.left;
                    }
                }
            }
            level.add(node.val);
        }
        result.add(level);

        return result;
    }
}