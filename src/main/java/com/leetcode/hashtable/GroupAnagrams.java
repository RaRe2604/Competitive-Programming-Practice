package com.leetcode.hashtable;

import java.util.*;

/**
 * User: Rahul Reddy
 * Date: 9/22/2020
 * Time: 11:38 AM
 */

public class GroupAnagrams {
    private static String getKey(String string) {
        char[] key = string.toCharArray();
        Arrays.sort(key);
        return Arrays.toString(key);
    }

    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        System.out.println(groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(groupAnagrams.groupAnagrams(new String[]{""}));
        System.out.println(groupAnagrams.groupAnagrams(new String[]{"a"}));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String key = getKey(str);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }
}
