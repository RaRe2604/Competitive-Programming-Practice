package com.leetcode.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void checkMyLinkedList() {
        MyLinkedList linkedList = new MyLinkedList(); // Initialize empty LinkedList
        linkedList.addAtHead(1);
        linkedList.print();
        linkedList.addAtTail(3);
        linkedList.print();
        linkedList.addAtIndex(1, 2);
        linkedList.print();// linked list becomes 1->2->3
        int res = linkedList.get(1);            // returns 2
        linkedList.print();
        linkedList.deleteAtIndex(1);  // now the linked list is 1->3
        linkedList.print();
        int res1 = linkedList.get(1);
        linkedList.print();
//        System.out.println(res + " -- " + res1);

        Assert.assertEquals(2, res);
        Assert.assertEquals(3, res1);


        linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.print();
        linkedList.addAtTail(3);
        linkedList.print();
        linkedList.addAtIndex(1, 2);
        linkedList.print();
        int res12 = linkedList.get(1);
        linkedList.print();
        linkedList.deleteAtIndex(0);
        linkedList.print();
        int res122 = linkedList.get(0);
        linkedList.print();

        Assert.assertEquals(2, res12);
        Assert.assertEquals(2, res122);

        linkedList = new MyLinkedList();
        linkedList.print();
        linkedList.addAtHead(7);
        linkedList.print();
        linkedList.addAtHead(2);
        linkedList.print();
        linkedList.addAtHead(1);
        linkedList.print();
        linkedList.addAtIndex(3, 0);
        linkedList.print();
        linkedList.deleteAtIndex(2);
        linkedList.print();
        linkedList.addAtHead(6);
        linkedList.print();
        linkedList.addAtTail(4);
        linkedList.print();
        int res123 = linkedList.get(4);
        linkedList.print();
        linkedList.addAtHead(4);
        linkedList.print();
        linkedList.addAtIndex(5, 0);
        linkedList.print();
        linkedList.addAtHead(6);
        linkedList.print();
//        System.out.println("Result ->" + res123);
        Assert.assertEquals(4, res123);
    }
}