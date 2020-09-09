package com.leetcode.queuestack;

import org.junit.Assert;
import org.junit.Test;

public class OpenTheLockTest {

    @Test
    public void openLock() {
        OpenTheLock openTheLock = new OpenTheLock();
        Assert.assertEquals(1, openTheLock.openLock(new String[]{"8888"}, "0009"));
        Assert.assertEquals(6, openTheLock.openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202"));
    }
}