package com.mprtcz.leetcode.BinaryTree.levelorder;

import com.mprtcz.leetcode.BinaryTree.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author mprtcz
 */
public class Solution2Test {

    @Test
    public void test() {
        TreeNode root = new TreeNode(3);
        TreeNode firstRight = new TreeNode(20);
        TreeNode firstLeft = new TreeNode(9);
        TreeNode secondLeft = new TreeNode(15);
        TreeNode secondRight = new TreeNode(7);
        firstRight.left = secondLeft;
        root.right = firstRight;
        root.left = firstLeft;
        firstRight.left = secondLeft;
        firstRight.right = secondRight;

        Solution2 solution = new Solution2();
        List<List<Integer>> result = solution.levelOrder(root);
        assertEquals(result.toString(), "[[3], [9, 20], [15, 7]]");
    }

    @Test
    public void test2() {
        Solution2 solution = new Solution2();
        List< List<Integer>> result = solution.levelOrder(null);
        assertEquals(result.toString(), "[]");
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

        Solution2 solution = new Solution2();
        List< List<Integer>> result = solution.levelOrder(root);
        assertEquals(result.toString(), "[[1], [2, 3], [4, 5]]");
    }

    @Test
    public void test5() {
        TreeNode root = new TreeNode(1);

        Solution2 solution = new Solution2();
        List< List<Integer>> result = solution.levelOrder(root);
        assertEquals(result.toString(), "[[1]]");
    }

    @Test
    public void test6() {
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

        Solution2 solution = new Solution2();
        List< List<Integer>> result = solution.levelOrder(root);
        assertEquals(result.toString(), "[[1], [2, 3], [4], [5], [6], [7]]");
    }
}
