package com.mprtcz.leetcode.BinaryTree.postorder;

import com.mprtcz.leetcode.BinaryTree.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author mprtcz
 */
public class SolutionTest {
    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        TreeNode firstRight = new TreeNode(2);
        TreeNode secondLeft = new TreeNode(3);
        firstRight.left = secondLeft;
        root.right = firstRight;

        Solution solution = new Solution();
        List<Integer> result = solution.postorderTraversal(root);
        assertEquals(result.toString(), "[3, 2, 1]");
    }
}
