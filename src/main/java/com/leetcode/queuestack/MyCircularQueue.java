package com.leetcode.queuestack;

/**
 * User: Rahul Reddy
 * Date: 9/4/2020
 * Time: 8:23 PM
 */

class MyCircularQueue {


    int CAPACITY;
    int size = 0;
    int[] arr;
    int head;
    int tail;
    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        this.CAPACITY = k;
        arr = new int[k];
        head = 0;
        tail = 0;
    }

    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(3); // set the size to be 3
        circularQueue.enQueue(1);  // return true
        circularQueue.enQueue(2);  // return true
        circularQueue.enQueue(3);  // return true
        circularQueue.enQueue(4);  // return false, the queue is full
        circularQueue.Rear();  // return 3
        circularQueue.isFull();  // return true
        circularQueue.deQueue();  // return true
        circularQueue.enQueue(4);  // return true
        circularQueue.Rear();  // return 4
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (isFull()) return false;
        arr[tail] = value;
        tail = (tail + 1) % CAPACITY;
        size++;
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty()) return false;
        head = (head + 1) % CAPACITY;
        size--;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (isEmpty()) return -1;
        return arr[head];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (isEmpty()) return -1;
        int idx = tail - 1 >= 0 ? tail - 1 : CAPACITY - 1;
        return arr[idx];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return size == CAPACITY;
    }
}