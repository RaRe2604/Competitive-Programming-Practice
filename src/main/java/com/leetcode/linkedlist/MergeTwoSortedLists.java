package com.leetcode.linkedlist;

/**
 * User: Rahul Reddy
 * Date: 9/2/2020
 * Time: 3:01 PM
 */

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode headA2 = mergeTwoSortedLists.new ListNode(4);
        ListNode headA1 = mergeTwoSortedLists.new ListNode(2, headA2);
        ListNode headA = mergeTwoSortedLists.new ListNode(1, headA1);
        ListNode headB2 = mergeTwoSortedLists.new ListNode(4);
        ListNode headB1 = mergeTwoSortedLists.new ListNode(3, headB2);
        ListNode headB = mergeTwoSortedLists.new ListNode(1, headB1);
        print(headA);
        print(headB);
        ListNode sortedList = mergeTwoSortedLists.mergeTwoLists(headA, headB);
        print(sortedList);
    }

    public static void print(ListNode head) {
        System.out.print("head" + "->");
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode result = new ListNode(0);
        ListNode head = result;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                ListNode temp = l1;
                l1 = l1.next;
                temp.next = null;
                result.next = temp;
                result = result.next;
            } else if (l1.val > l2.val) {
                ListNode temp = l2;
                l2 = l2.next;
                temp.next = null;
                result.next = temp;
                result = result.next;
            } else {
                ListNode temp1 = l1;
                ListNode temp2 = l2;
                l1 = l1.next;
                l2 = l2.next;
                temp1.next = temp2;
                temp2.next = null;
                result.next = temp1;
                result = result.next.next;
            }
        }

        if (l1 != null)
            result.next = l1;
        else if (l2 != null)
            result.next = l2;
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
