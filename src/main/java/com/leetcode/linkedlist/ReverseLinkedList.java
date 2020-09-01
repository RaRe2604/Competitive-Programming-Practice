package com.leetcode.linkedlist;

/**
 * User: Rahul Reddy
 * Date: 9/1/2020
 * Time: 5:02 PM
 */

public class ReverseLinkedList {
    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode head5 = reverseLinkedList.new ListNode(5);
        ListNode head4 = reverseLinkedList.new ListNode(4, head5);
        ListNode head3 = reverseLinkedList.new ListNode(3, head4);
        ListNode head2 = reverseLinkedList.new ListNode(2, head3);
        ListNode head = reverseLinkedList.new ListNode(1, head2);
        print(head);
        head = reverseLinkedList.reverseList(head);
        print(head);
    }

    public static void print(ListNode start) {
        System.out.print("head" + "->");
        while (start != null) {
            System.out.print(start.val + "->");
            start = start.next;
        }
        System.out.println("null");
    }


    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = previous;
            previous = current;
            current = nextTemp;
        }
        return previous;
    }

    public class ListNode {
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
