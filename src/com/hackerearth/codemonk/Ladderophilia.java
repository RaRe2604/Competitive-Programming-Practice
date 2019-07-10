package com.hackerearth.codemonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author rr38746
 * DATE 10-07-2019
 * TIME 11:10
 */
public class Ladderophilia {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer buffer = new StringBuffer();
        int count = Integer.parseInt(reader.readLine().trim());
        while (count-- > 0) {
            buffer.append("*   *").append("\n").append("*   *").append("\n").append("*****").append("\n");
        }
        buffer.append("*   *").append("\n").append("*   *").append("\n");
        System.out.println(buffer);
    }
}
