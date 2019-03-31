package com.mprtcz.leetcode.recursivegeneral;

/**
 * @author mprtcz
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return val + "";
    }

    public String printAll() {
        String value =  val + " -> ";
        if (next != null && next != this) {
            value += next.printAll();
        } else if (next == this) {
            value += "CIRCULAR REFERENCE!";
        } else {
            value += " NULL";
        }
        return value;
    }

}
