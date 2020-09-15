package com.leetcode.queuestack;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class KeysAndRoomsTest {

    @Test
    public void canVisitAllRooms() {
        KeysAndRooms keysAndRooms = new KeysAndRooms();
        Assert.assertTrue(keysAndRooms.canVisitAllRooms(Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3), Arrays.asList())));
        Assert.assertFalse(keysAndRooms.canVisitAllRooms(Arrays.asList(Arrays.asList(1, 3), Arrays.asList(3, 0, 1), Arrays.asList(2), Arrays.asList(0))));
        Assert.assertTrue(keysAndRooms.canVisitAllRooms(Arrays.asList(Arrays.asList(1), Arrays.asList(1, 1))));
        Assert.assertFalse(keysAndRooms.canVisitAllRooms(Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(), Arrays.asList(3))));
    }
}