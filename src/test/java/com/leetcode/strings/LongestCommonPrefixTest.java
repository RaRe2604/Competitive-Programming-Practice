package com.leetcode.strings;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        Assert.assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        Assert.assertEquals("r", longestCommonPrefix.longestCommonPrefix(new String[]{"rog","racecar","ram"}));
        Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar",""}));
        Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{}));
        Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{""}));
        Assert.assertEquals("a", longestCommonPrefix.longestCommonPrefix(new String[]{"a"}));
    }
}