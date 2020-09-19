package com.leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * User: Rahul Reddy
 * Date: 9/19/2020
 * Time: 2:43 PM
 */

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char character : s.toCharArray()) {
            map.put(character, map.getOrDefault(character, 0) + 1);
        }
        return IntStream.range(0, s.length()).parallel().filter(index -> map.get(s.charAt(index)) == 1).findFirst().orElse(-1);
    }
}
