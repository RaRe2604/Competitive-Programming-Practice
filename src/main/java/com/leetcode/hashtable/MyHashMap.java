package com.leetcode.hashtable;

import java.util.Arrays;

/**
 * User: Rahul Reddy
 * Date: 9/16/2020
 * Time: 2:29 PM
 */

public class MyHashMap {
    private final int INIT_SIZE = 1000001;
    private int[] buckets;

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        buckets = new int[INIT_SIZE];
        Arrays.fill(buckets, -1);
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        buckets[key] = value;
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        return buckets[key];
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        buckets[key] = -1;
    }

}
