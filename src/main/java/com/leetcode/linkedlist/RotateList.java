package com.leetcode.linkedlist;

/**
 * User: Rahul Reddy
 * Date: 9/3/2020
 * Time: 11:15 AM
 */

public class RotateList {

    public static void main(String[] args) {
        RotateList rotateList = new RotateList();
        ListNode ListNode5 = new ListNode(5);
        ListNode ListNode4 = new ListNode(4, ListNode5);
        ListNode ListNode3 = new ListNode(3, ListNode4);
        ListNode ListNode2 = new ListNode(2, ListNode3);
        ListNode ListNode1 = new ListNode(1, ListNode2);
        rotateList.rotateRight(ListNode1, 2);
    }

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || k < 1)
            return head;

        int countOfNodes = 0;
        ListNode start = head;
        while (start != null) {
            countOfNodes++;
            start = start.next;
        }

        int rotate = k % countOfNodes;
        ListNode slowPointer = head;
        ListNode fastPointer = head;

//        Moving the fastPointer rotate steps forward than slowPointer
        while (fastPointer != null && rotate-- > 0) {
            fastPointer = fastPointer.next;
        }
//        Moving the slowPointer and fastPointer one by one step ahead till fastPointer reaches ends
        while (fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }

        fastPointer.next = head;
        head = slowPointer.next;
        slowPointer.next = null;
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return val + "";
        }
    }
}
