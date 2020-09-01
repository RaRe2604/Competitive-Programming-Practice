package com.leetcode.linkedlist;

/**
 * User: Rahul Reddy
 * Date: 9/1/2020
 * Time: 3:03 PM
 */

public class Intersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int endOfListA = 0;
        int endOfListB = 0;
        ListNode A = headA;
        ListNode B = headB;
        while (A != null && B != null) {
//            We consider the number as 2 to check the loop comes back to original Node.
//            Example: headA == null ->    endOfListA = 1
//            Example: headB == null ->    endOfListB = 1
//            Example: headA -> headB == null ->    endOfListB = 2
//            Example: headB -> headA == null ->    endOfListA = 2

            if ((endOfListA >= 2) || (endOfListB >= 2)) return null;
            if (A == B) return A;
            A = A.next;
            B = B.next;
            if (A == null) {
                endOfListA++;
                A = headB;
            } else if (B == null) {
                endOfListB++;
                B = headA;
            }
        }
        return null;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
