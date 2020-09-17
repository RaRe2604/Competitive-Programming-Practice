package com.leetcode.hashtable;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {

    @Test
    public void isHappy() {
        HappyNumber happyNumber = new HappyNumber();
        Assert.assertTrue(happyNumber.isHappy(19));
    }
}