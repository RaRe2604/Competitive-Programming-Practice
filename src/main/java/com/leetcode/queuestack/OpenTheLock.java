package com.leetcode.queuestack;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * User: Rahul Reddy
 * Date: 9/8/2020
 * Time: 6:07 PM
 */

public class OpenTheLock {
    public int openLock(String[] deadends, String target) {
        int count = 0;
        int[][] possibleChanges = {
                {0, 0, 0, 1}, {0, 0, 1, 0}, {0, 1, 0, 0}, {1, 0, 0, 0},
                {0, 0, 0, -1}, {0, 0, -1, 0}, {0, -1, 0, 0}, {-1, 0, 0, 0}
        };

        Queue<String> queue = new ArrayDeque<>();
        Set<String> visitedNodes = new HashSet<>();
        Set<String> deadEnds = Stream.of(deadends).collect(Collectors.toSet());
        queue.offer("0000");

        while (!queue.isEmpty()) {
            for (int size = queue.size(); size > 0; size--) {
                String key = queue.poll();
                if (target.equalsIgnoreCase(key)) {
                    return count;
                }
                if (deadEnds.contains(key) || visitedNodes.contains(key)) {
                    continue;
                }
                visitedNodes.add(key);
                for (int index = 0; index < 8; index++) {
                    StringBuilder val = new StringBuilder();
                    for (int i = 0; i < 4; i++) {
                        if ((key.charAt(i) - '0') + possibleChanges[index][i] == -1) {
                            val.append("9");
                        } else if ((key.charAt(i) - '0') + possibleChanges[index][i] == 10) {
                            val.append("0");
                        } else {
                            val.append((key.charAt(i) - '0') + possibleChanges[index][i]);
                        }
                    }
                    queue.add(val.toString());
                }
            }
            count++;
        }
        return -1;
    }
}