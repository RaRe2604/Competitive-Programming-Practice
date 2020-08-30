package com.leetcode.strings;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWord3Test {

    @Test
    public void reverseWords() {
        ReverseWord3 reverseWord3 = new ReverseWord3();
        Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWord3.reverseWords("Let's take LeetCode contest"));
    }
}