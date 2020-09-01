package com.leetcode.linkedlist;

/**
 * User: Rahul Reddy
 * Date: 9/1/2020
 * Time: 3:34 PM
 */

public class RemoveNthNode {
    public static void main(String[] args) {
        RemoveNthNode removeNthNode = new RemoveNthNode();
        ListNode head5 = removeNthNode.new ListNode(5);
        ListNode head4 = removeNthNode.new ListNode(4, head5);
        ListNode head3 = removeNthNode.new ListNode(3, head4);
        ListNode head2 = removeNthNode.new ListNode(2, head3);
        ListNode head1 = removeNthNode.new ListNode(1, head2);
        print(head1);
        head1 = removeNthNode.removeNthFromEnd(head1, 5);
        print(head1);

    }

    public static void print(ListNode start) {
        System.out.print("head" + "->");
        while (start != null) {
            System.out.print(start.val + "->");
            start = start.next;
        }
        System.out.println("null");
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        for (int index = 0; index < n; index++) {
            fastPointer = fastPointer.next;
        }
        if (fastPointer == null)
            return head.next;
        while (fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        slowPointer.next = slowPointer.next.next;
        return head;
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
    }
}
