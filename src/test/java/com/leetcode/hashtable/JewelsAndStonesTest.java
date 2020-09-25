package com.leetcode.hashtable;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JewelsAndStonesTest {

    @Test
    public void numJewelsInStones() {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        Assert.assertEquals(3, jewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
        Assert.assertEquals(0, jewelsAndStones.numJewelsInStones("z", "ZZ"));
    }
}