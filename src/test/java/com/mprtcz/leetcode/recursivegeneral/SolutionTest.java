package com.mprtcz.leetcode.recursivegeneral;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author mprtcz
 */
public class SolutionTest {

    @Test
    public void generate_test() {
        Solution solution = new Solution();

        List<List<Integer>> result = solution.generate(5);

        assertEquals("[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]", result.toString());
    }

    @Test
    public void getRow_test() {
        Solution solution = new Solution();

        List<Integer> result = solution.getRow(1);
        System.out.println(result.toString());
        List<Integer> result1 = solution.getRow(2);
        System.out.println(result1.toString());
        List<Integer> result2 = solution.getRow(3);
        assertEquals("[1, 3, 3, 1]", result2.toString());
        List<Integer> result3 = solution.getRow(5);
        assertEquals("[1, 5, 10, 10, 5, 1]", result3.toString());
    }

    @Test
    public void reverseList_test() {
        Solution solution = new Solution();

        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;


        ListNode result = solution.reverseIteratively(first);
//        printNodes(result);
        assertEquals("xd", result);
    }

    @Test
    public void reverseList_test2() {
        Solution solution = new Solution();

        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;


        ListNode result = solution.reverseIteratively2(first);
//        printNodes(result);
        result.printAll();
        assertEquals("5 -> 4 -> 3 -> 2 -> 1 ->  NULL", result.printAll());
    }

    @Test
    public void reverseList_testTwoElems() {
        Solution solution = new Solution();

        ListNode first = new ListNode(1);
        first.next = new ListNode(2);

        ListNode result = solution.reverseIteratively(first);
        System.out.println(result.printAll());
        assertEquals("xd", result);
    }


}
