package com.geeksforgeeks.practice;

import java.util.Scanner;

public class AlmostEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        boolean flag = false;
        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(coutChars(s1, s2));
        }
    }

    static int coutChars(String s1, String s2) {
        int total = 0;
        int[] alphabets = new int[26];

        char[] firstArray = s1.toCharArray();
        char[] secondArray = s2.toCharArray();

        for (char x : firstArray) alphabets[x - 'a']++;
        for (char x : secondArray) alphabets[x - 'a']--;

        for (int x : alphabets) total = total + Math.abs(x);

        return total;
    }
}
