package com.leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Rahul Reddy
 * Date: 9/17/2020
 * Time: 12:17 PM
 */

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int index = 0; index < s.length(); index++) {
            if (map.containsKey(s.charAt(index))) {
                if (t.charAt(index) != map.get(s.charAt(index))) {
                    return false;
                }
            } else if (map.containsValue(t.charAt(index))) {
                return false;
            } else {
                map.put(s.charAt(index), t.charAt(index));
            }
        }
        return true;
    }
}
