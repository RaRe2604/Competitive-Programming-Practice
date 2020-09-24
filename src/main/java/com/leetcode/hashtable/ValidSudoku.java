package com.leetcode.hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * User: Rahul Reddy
 * Date: 9/23/2020
 * Time: 10:53 AM
 */

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                char character = board[row][column];
                if (character != '.') {
                    if (!set.add(character + " found in " + row + " row") ||
                            !set.add(character + " found in " + column + " column") ||
                            !set.add(character + " found in " + ((row / 3) + "-" + (column / 3)) + " subbox")) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}


//0 1 2
//3 4 5
//6 7 8