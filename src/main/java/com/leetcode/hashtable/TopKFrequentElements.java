package com.leetcode.hashtable;

import java.util.*;
import java.util.stream.IntStream;

/**
 * User: Rahul Reddy
 * Date: 9/30/2020
 * Time: 3:21 PM
 */

public class TopKFrequentElements {
    public static void main(String[] args) {
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        System.out.println(Arrays.toString(topKFrequentElements.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
        System.out.println(Arrays.toString(topKFrequentElements.topKFrequent(new int[]{1, 1, 1, 2, 2, 3, 3}, 2)));
        System.out.println(Arrays.toString(topKFrequentElements.topKFrequent(new int[]{1, 2, 2, 3}, 1)));
        System.out.println(Arrays.toString(topKFrequentElements.topKFrequent(new int[]{4, 1, -1, 2, -1, 2, 3}, 2)));
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        IntStream.range(0, nums.length).parallel().forEach(i -> map.put(nums[i], map.getOrDefault(nums[i], 0) + 1));
        Queue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(map::get).reversed());
        map.keySet().forEach(queue::offer);
        return IntStream.range(0, k).map(index -> queue.poll()).toArray();
    }
}
