package com.leetcode.binarysearch;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumberTest {

    @Test
    public void guessNumber() {
        GuessNumber guessNumber = new GuessNumber();
        Assert.assertEquals(6, guessNumber.guessNumber(10, 6));
        Assert.assertEquals(1, guessNumber.guessNumber(1, 1));
        Assert.assertEquals(1, guessNumber.guessNumber(2, 1));
        Assert.assertEquals(2, guessNumber.guessNumber(2, 2));
    }
}