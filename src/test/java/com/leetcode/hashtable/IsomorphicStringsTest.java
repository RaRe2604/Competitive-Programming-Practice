package com.leetcode.hashtable;

import org.junit.Assert;
import org.junit.Test;

public class IsomorphicStringsTest {

    @Test
    public void isIsomorphic() {
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        Assert.assertTrue(isomorphicStrings.isIsomorphic("egg", "add"));
        Assert.assertFalse(isomorphicStrings.isIsomorphic("foo", "bar"));
        Assert.assertTrue(isomorphicStrings.isIsomorphic("paper", "title"));
        Assert.assertFalse(isomorphicStrings.isIsomorphic("ab", "aa"));
    }
}