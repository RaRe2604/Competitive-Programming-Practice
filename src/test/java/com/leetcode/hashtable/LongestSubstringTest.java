package com.leetcode.hashtable;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringTest {

    @Test
    public void lengthOfLongestSubstring() {
        LongestSubstring longestSubstring = new LongestSubstring();
        Assert.assertEquals(3, longestSubstring.lengthOfLongestSubstring("abcabcab"));
        Assert.assertEquals(4, longestSubstring.lengthOfLongestSubstring("abcabcad"));
        Assert.assertEquals(1, longestSubstring.lengthOfLongestSubstring("bbbbb"));
        Assert.assertEquals(3, longestSubstring.lengthOfLongestSubstring("pwwkew"));
        Assert.assertEquals(2, longestSubstring.lengthOfLongestSubstring("aab"));
    }
}