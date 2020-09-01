package com.leetcode.linkedlist;

/**
 * User: Rahul Reddy
 * Date: 9/1/2020
 * Time: 7:39 PM
 */

public class OddEven {
    public static void main(String[] args) {
        OddEven oddEven = new OddEven();
        ListNode head5 = oddEven.new ListNode(5);
        ListNode head4 = oddEven.new ListNode(4, head5);
        ListNode head3 = oddEven.new ListNode(3, head4);
        ListNode head2 = oddEven.new ListNode(2, head3);
        ListNode head = oddEven.new ListNode(1, head2);
        print(head);
        head = oddEven.oddEvenList(head);
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

    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
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

        @Override
        public String toString() {
            return val + "";
        }
    }
}
