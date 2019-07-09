package com.hackerearth.codemonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author rr38746
 * DATE 09-07-2019
 * TIME 14:48
 */
public class LifeTheUniverseAndEverything {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer buffer = new StringBuffer();
        int input = Integer.parseInt(reader.readLine());
        while (input != 42) {
            buffer.append(input).append("\n");
            input = Integer.parseInt(reader.readLine());
        }
        System.out.println(buffer);

    }
}
