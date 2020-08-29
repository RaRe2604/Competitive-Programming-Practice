package com.hackerearth.codemonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author rr38746
 * DATE 05-07-2019
 * TIME 19:02
 */
public class CharSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] character = reader.readLine().trim().toCharArray();
        int sum = 0;
        for (int i = 0; i < character.length; i++) {
            sum = sum + character[i] - 'a';
        }
        System.out.println(sum + character.length);
    }
}
