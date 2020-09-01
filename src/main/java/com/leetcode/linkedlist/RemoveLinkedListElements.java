package com.leetcode.linkedlist;

/**
 * User: Rahul Reddy
 * Date: 9/1/2020
 * Time: 7:10 PM
 */

public class RemoveLinkedListElements {
    public static void print(ListNode start) {
        System.out.print("head" + "->");
        while (start != null) {
            System.out.print(start.val + "->");
            start = start.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();
        ListNode head5 = removeLinkedListElements.new ListNode(3);
        ListNode head4 = removeLinkedListElements.new ListNode(4, head5);
        ListNode head3 = removeLinkedListElements.new ListNode(3, head4);
        ListNode head2 = removeLinkedListElements.new ListNode(2, head3);
        ListNode head = removeLinkedListElements.new ListNode(3, head2);
        print(head);
        head = removeLinkedListElements.removeElements(head, 3);
        print(head);
    }

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode node = head;
        while (node != null) {
            if (node.next != null && node.next.val == val) {
                node.next = node.next.next;
            }
            node = node.next;
        }
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
