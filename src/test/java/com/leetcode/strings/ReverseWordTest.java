package com.leetcode.strings;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordTest {

    @Test
    public void reverseWords() {
        ReverseWord reverseWord = new ReverseWord();
        Assert.assertEquals("blue is sky the", reverseWord.reverseWords("the sky is blue"));
        Assert.assertEquals("world! hello", reverseWord.reverseWords("  hello world!  "));
        Assert.assertEquals("example good a", reverseWord.reverseWords("a good   example"));
    }
}