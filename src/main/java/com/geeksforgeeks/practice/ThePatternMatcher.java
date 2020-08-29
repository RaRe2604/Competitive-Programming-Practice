package com.geeksforgeeks.practice;

import java.util.Scanner;

public class ThePatternMatcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            ThePatternMatcherSolver.follPatt(s);
        }
    }
}

class ThePatternMatcherSolver {
    static void follPatt(String s) {
        char[] array = s.toCharArray();
        int sumValid = 0;
        for (char singleChar : array) {
            if (singleChar == 'x') sumValid++;
            if (singleChar == 'y') sumValid--;
            if (sumValid < 0) break;
        }
        System.out.println(sumValid == 0 ? "1" : "0");
        System.out.println();
    }
}
