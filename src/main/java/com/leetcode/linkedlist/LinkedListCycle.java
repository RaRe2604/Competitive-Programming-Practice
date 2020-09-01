package com.leetcode.linkedlist;

/**
 * User: Rahul Reddy
 * Date: 9/1/2020
 * Time: 11:41 AM
 */

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slowPointer = head;
        ListNode fastPointer = head.next;
        while (fastPointer != null && fastPointer.next != null) {
            if (slowPointer == fastPointer)
                return true;
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return false;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
