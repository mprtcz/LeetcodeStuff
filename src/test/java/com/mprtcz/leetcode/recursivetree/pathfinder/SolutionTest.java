package com.mprtcz.leetcode.recursivetree.pathfinder;

import com.mprtcz.leetcode.recursivetree.TreeNode;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * @author mprtcz
 */
public class SolutionTest {


    @Test
    public void test3() {
        TreeNode root = new TreeNode(1);
        TreeNode firstRight = new TreeNode(3);
        TreeNode firstLeft = new TreeNode(2);
        TreeNode secondLeft = new TreeNode(4);
        TreeNode secondRight = new TreeNode(5);

        root.left = firstLeft;
        root.right = firstRight;
        firstLeft.left = secondLeft;
        firstLeft.right= secondRight;

        Solution solution = new Solution();
        boolean result = solution.hasPathSum(root, 5);

        assertFalse(result);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(3);
        TreeNode firstRight = new TreeNode(4);
        TreeNode firstLeft = new TreeNode(1);
        TreeNode secondLeft = new TreeNode(2);
        TreeNode secondRight = new TreeNode(5);

        root.left = firstLeft;
        root.right = firstRight;
        firstLeft.left = secondLeft;
        firstLeft.right= secondRight;

        Solution solution = new Solution();
        assertFalse(solution.hasPathSum(root, 3));
        assertFalse(solution.hasPathSum(root, 4));
        assertTrue(solution.hasPathSum(root, 6));
        assertTrue(solution.hasPathSum(root, 7));
        assertFalse(solution.hasPathSum(root, 8));
        assertTrue(solution.hasPathSum(root, 9));
        assertFalse(solution.hasPathSum(root, 10));

    }
}
