package com.leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Rahul Reddy
 * Date: 9/25/2020
 * Time: 2:24 PM
 */

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int jewels = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : S.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : J.toCharArray()) {
            jewels += map.getOrDefault(ch, 0);
        }
        return jewels;
    }
}
