package com.leetcode.linkedlist;

/**
 * User: Rahul Reddy
 * Date: 9/2/2020
 * Time: 7:09 PM
 */

public class FlattenLinkedList {
    public static void main(String[] args) {

        Node node12 = new Node(12);
        Node node11 = new Node(11, node12);

        Node node10 = new Node(10);
        Node node9 = new Node(9, node10);
        Node node8 = new Node(8, node9);
        Node node7 = new Node(7, node8);

        Node node6 = new Node(6);
        Node node5 = new Node(5, node6);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        node3.child = node7;
        node8.child = node11;

        Node head = node1;

        FlattenLinkedList flattenLinkedList = new FlattenLinkedList();
        flattenLinkedList.flatten(head);
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");

    }

    public Node flatten(Node head) {
        Node result = head;
        while (head != null) {
//            System.out.print(head.val + "->");
            if (head.child != null) {
                Node headNext = head.next;
                Node tail = flatten(head.child);
                head.next = head.child;
                tail.next = headNext;
                if (headNext != null) headNext.prev = tail;
                headNext.prev = tail;
                head.child.prev = head;
                result = tail;
                head = headNext;
            } else {
                result = head;
                head = head.next;
            }
        }

        return result;
    }

    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return val + "";
        }
    }
}
