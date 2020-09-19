package com.leetcode.hashtable;

import org.junit.Assert;
import org.junit.Test;

public class FirstUniqueCharacterTest {

    @Test
    public void firstUniqChar() {
        FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();
        Assert.assertEquals(0, firstUniqueCharacter.firstUniqChar("leetcode"));
        Assert.assertEquals(2, firstUniqueCharacter.firstUniqChar("loveleetcode"));
    }
}