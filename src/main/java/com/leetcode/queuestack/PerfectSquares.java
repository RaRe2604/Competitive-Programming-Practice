package com.leetcode.queuestack;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

/**
 * User: Rahul Reddy
 * Date: 9/10/2020
 * Time: 6:51 PM
 */

public class PerfectSquares {
    public int numSquares(int n) {
        int count = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(0);
        Set<Integer> visitedNodes = new HashSet<>();
        visitedNodes.add(0);
        while (!queue.isEmpty()) {
            count++;
            int size = queue.size();
            while (size-- > 0) {
                int currentNumber = queue.poll();
                for (int index = 1; index * index <= n; index++) {
                    int nextNumber = currentNumber + (index * index);
                    if (nextNumber == n) {
                        return count;
                    }
                    if (nextNumber > n)
                        break;
                    if (!visitedNodes.contains(nextNumber)) {
                        queue.offer(nextNumber);
                        visitedNodes.add(nextNumber);
                    }
                }
            }
        }
        return count;
    }
}
