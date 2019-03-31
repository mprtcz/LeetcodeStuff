package com.mprtcz.leetcode.recursivetree.depthfinder;

import com.mprtcz.leetcode.recursivetree.TreeNode;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * @author mprtcz
 */
public class SolutionTest {

    @Test
    public void testSolution() {
        TreeNode root = new TreeNode(1);
        TreeNode firstLeft = new TreeNode(2);
        TreeNode firstRight = new TreeNode(3);
        TreeNode secondLeft = new TreeNode(4);
        TreeNode thirdRight = new TreeNode(5);
        TreeNode fourthLeft = new TreeNode(6);
        TreeNode fifthRight = new TreeNode(7);

        root.left = firstLeft;
        root.right = firstRight;
        firstRight.left = secondLeft;
        secondLeft.right= thirdRight;
        thirdRight.left = fourthLeft;
        fourthLeft.right = fifthRight;

        Solution solution = new Solution();

        int result = solution.maxDepth(root);

        assertEquals(6, result);
    }


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

        int result = solution.maxDepth(root);

        assertEquals(3, result);
    }
}
