package com.mprtcz.leetcode.BinaryTree.levelorder;

import com.mprtcz.leetcode.BinaryTree.TreeNode;

import java.util.*;

/**
 * @author mprtcz
 */
public class Solution2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> kueue = new LinkedList<TreeNode>();
        Queue<Integer> levels = new LinkedList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int level = 0;

        kueue.add(root);
        levels.add(level);

        while (!kueue.isEmpty()) {
            TreeNode node = kueue.remove();
            Integer curerentLevel = levels.remove();
            if (node == null) return new ArrayList<List<Integer>>();

            if (result.size() < curerentLevel + 1) {
                result.add(new ArrayList<Integer>());
            }

            result.get(curerentLevel).add(node.val);

            curerentLevel++;
            if (node.left != null) {kueue.add(node.left); levels.add(curerentLevel);}
            if (node.right != null) {kueue.add(node.right); levels.add(curerentLevel);}
        }

        return result;
    }
}
