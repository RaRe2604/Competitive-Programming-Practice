package com.leetcode.hashtable;

import java.util.LinkedList;

/**
 * User: Rahul Reddy
 * Date: 9/16/2020
 * Time: 2:29 PM
 */

public class MyHashSet {
    private int INIT_SIZE = 10000;
    private LinkedList[] buckets;

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        buckets = new LinkedList[INIT_SIZE];
    }

    public void add(int key) {
        int hash = hashFunction(key);
        if (buckets[hash] == null) {
            buckets[hash] = new LinkedList();
        }
        LinkedList list = buckets[hash];
        if (!list.contains(key)) {
            list.add(key);
        }
    }

    public void remove(int key) {
        LinkedList list = buckets[hashFunction(key)];
        if (list != null) {
            list.removeIf(i -> i.equals(key));
        }
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        LinkedList list = buckets[hashFunction(key)];
        return list != null && list.contains(key);
    }

    private int hashFunction(int n) {
        return 31 * n % INIT_SIZE;
    }

}
