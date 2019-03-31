package com.mprtcz.leetcode.recursivegeneral;

import java.util.*;

/**
 * @author mprtcz
 */
public class Solution {


    public List<List<Integer>> generate(int numRows) {
        return helperIteratively(numRows);

    }

    public List<List<Integer>> helperIteratively(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (numRows == 0) return result;
        List<Integer> partial = new ArrayList<Integer>();
        partial.add(1);
        result.add(partial);
        for (int i = 0; i < numRows - 1; i++) {
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            for (int j = 0; j < result.get(i).size() - 1; j++) {
                row.add( result.get(i).get(j) +  result.get(i).get(j + 1));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }


    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        if (rowIndex == 0) return result;
        result.add(1);
        for (int i = 1; i < rowIndex; i++) {
            getList(result);
        }
        return result;

    }

    public void getList(List<Integer> previous) {
        int previousValue = previous.get(0);
        for (int i = 1; i < previous.size(); i++) {
            int temp = previous.get(i);
            previous.set(i, previous.get(i) + previousValue);
            previousValue = temp;
        }
        previous.add(1);
    }


    public ListNode reverseList(ListNode head) {
        return reverse(head);
    }

    ListNode reverse(ListNode node) {
        if (node.next.next == null) {
            node.next.next = node;
            return node.next;
        }
        return reverse(node); // need to reverse the rest after a reverse or something ;x
    }

    ListNode reverseIteratively(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode node = head;
        Stack<ListNode> nodes = new Stack<ListNode>();
        while (node != null) {
            nodes.push(node);
            node = node.next;
        }
        ListNode first = nodes.pop();
        ListNode next = nodes.pop();
        first.next = next;
        next.next = null;
        ListNode newNode = null;
        while (!nodes.isEmpty()) {
            System.out.println("next = " + next);
            newNode = nodes.pop();
            next.next = newNode;
            next = newNode;
        }
        if (newNode != null) newNode.next = null;

        return first;
    }

    ListNode reverseIteratively2(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;

        ListNode previous = null;
        ListNode current = head;
        ListNode next = head.next;

        while (current != null) {
            current.next = previous;
            previous = current;
            current = next;
            if (next != null) next = next.next;
        }
        return previous;
    }


    static void printNodes(ListNode node) {
        ListNode current = node;
        while (current != null) {
            System.out.print(node + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public int[] twoSum(int[] nums, final int target) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null && map.get(nums[i]) != i) {
                return new int[] {i, map.get(nums[i])};
            }
            map.put(target - nums[i], i);
        }
        return new int[]{};
    }
}
