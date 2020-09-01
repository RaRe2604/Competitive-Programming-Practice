package com.leetcode.linkedlist;

/**
 * User: Rahul Reddy
 * Date: 9/1/2020
 * Time: 11:41 AM
 */

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (fastPointer == slowPointer){
                slowPointer = head;
                while( fastPointer != slowPointer){
                    fastPointer = fastPointer.next;
                    slowPointer = slowPointer.next;
                }
                return slowPointer;
            }
        }
        return null;
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
