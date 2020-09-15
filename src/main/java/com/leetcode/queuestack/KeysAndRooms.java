package com.leetcode.queuestack;

import java.util.*;
import java.util.stream.IntStream;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        final int INITIAL_ROOM = 0;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[rooms.size()];
        queue.offer(INITIAL_ROOM);
        visited[INITIAL_ROOM] = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                List<Integer> list = rooms.get(queue.poll());
                for (int key : list) {
                    if (!visited[key]) {
                        queue.offer(key);
                        visited[key] = true;
                    }
                }
            }
        }
        return IntStream.range(0, visited.length).allMatch(index -> visited[index]);
    }
}