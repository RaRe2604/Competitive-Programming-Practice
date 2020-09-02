package com.leetcode.linkedlist;

/**
 * User: Rahul Reddy
 * Date: 9/2/2020
 * Time: 4:03 PM
 */

public class AddTwoNumber {
    public static void main(String[] args) {
        AddTwoNumber addTwoNumber = new AddTwoNumber();
        ListNode headA2 = addTwoNumber.new ListNode(4);
        ListNode headA1 = addTwoNumber.new ListNode(2, headA2);
        ListNode headA = addTwoNumber.new ListNode(1, headA1);
        ListNode headB2 = addTwoNumber.new ListNode(4);
        ListNode headB1 = addTwoNumber.new ListNode(3, headB2);
        ListNode headB = addTwoNumber.new ListNode(1, headB1);
        print(headA);
        print(headB);
        print(addTwoNumber.addTwoNumbers(headA, headB));
    }

    public static void print(ListNode head) {
        System.out.print("head" + "->");
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l2 == null) return l1;
        if (l1 == null) return l2;
        ListNode result = new ListNode(0);
        ListNode head = result;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int sum = carry + l1.val + l2.val;
            int digitSum = sum % 10;
            carry = sum == digitSum ? 0 : 1;

            result.next = new ListNode(digitSum);

            l1 = l1.next;
            l2 = l2.next;
            result = result.next;
        }

        ListNode nextToProcess = (l1 == null) ? l2 : l1;

        while (nextToProcess != null) {
            int sum = carry + nextToProcess.val;
            int digitSum = sum % 10;
            carry = sum == digitSum ? 0 : 1;
            result.next = new ListNode(digitSum);
            nextToProcess = nextToProcess.next;
            result = result.next;
        }

        if (carry == 1)
            result.next = new ListNode(carry);
        return head.next;
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
            return "" + val;
        }
    }
}
