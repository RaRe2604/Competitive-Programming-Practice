package com.leetcode.linkedlist;

/**
 * User: Rahul Reddy
 * Date: 9/1/2020
 * Time: 8:51 PM
 */

public class PalindromeLinkedList {
    public static void main(String[] args) {
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        ListNode head6 = palindromeLinkedList.new ListNode(1);
        ListNode head5 = palindromeLinkedList.new ListNode(2, head6);
        ListNode head4 = palindromeLinkedList.new ListNode(4, head5);
        ListNode head3 = palindromeLinkedList.new ListNode(3, head4);
        ListNode head2 = palindromeLinkedList.new ListNode(2, head3);
        ListNode head = palindromeLinkedList.new ListNode(1, head2);
        print(head);
        System.out.println(palindromeLinkedList.isPalindrome(head));
    }

    public static void print(ListNode start) {
        System.out.print("head" + "->");
        while (start != null) {
            System.out.print(start.val + "->");
            start = start.next;
        }
        System.out.println("null");
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        ListNode reverseHead = reverseLinkedList(slowPointer);

        System.out.print("HEAD->");
        print(head);
        System.out.print("REVERSE->");
        print(reverseHead);
        while (head != null && reverseHead != null) {
            if (head.val != reverseHead.val) {
                return false;
            }
            head = head.next;
            reverseHead = reverseHead.next;
        }
        return true;
    }

    ListNode reverseLinkedList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
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
