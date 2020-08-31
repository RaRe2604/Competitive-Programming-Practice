package com.leetcode.linkedlist;

/**
 * User: Rahul Reddy
 * Date: 8/31/2020
 * Time: 12:07 PM
 */

public class MyLinkedList {

    /**
     * Initialize your data structure here.
     */

    Node head;

    public MyLinkedList() {
//        head = new Node();
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        Node start = head;
        if (index == 0)
            return head.value;
        else {
            int i = 0;
            while (start != null) {
                if (index == i++)
                    return start.value;
                start = start.next;
            }
        }
        return -1;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        if (head == null)
            head = new Node(val);
        else {
            Node start = head;
            head = new Node(val);
            head.next = start;
        }
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        Node start = head;
        while (start.next != null) {
            start = start.next;
        }
        Node tailNode = new Node(val);
        start.next = tailNode;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        Node start = head;
        if (index == 0) {
            head = new Node(val);
        } else {
            int i = 0;
            while (start != null) {
                if (index == ++i) {
                    if (start.next == null) {
                        addAtTail(val);
                    } else {
                        Node node = new Node(val);
                        Node mid = start.next;
                        start.next = node;
                        node.next = mid;
                    }
                    break;
                }
                start = start.next;
            }
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        Node start = head;
        if (index == 0)
            head = head.next;
        else {
            int i = 0;
            while (start.next != null) {
                if (index == ++i) {
                    start.next = start.next.next;
                    break;
                }
                start = start.next;
            }
        }
    }

    public void print() {
        Node start = head;
        System.out.print("head" + "->");
        while (start != null) {
            System.out.print(start.value + "->");
            start = start.next;
        }
        System.out.println("null");

    }

}

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }

    Node() {

    }
}


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */