package com.hackerearth.codemonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author rr38746
 * DATE 12-07-2019
 * TIME 15:05
 */
public class LiftQueries {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(reader.readLine().trim());
        int initial = 0;
        int top = 7;
        StringBuffer buffer = new StringBuffer();
        while (testcases-- > 0) {
            int called = Integer.parseInt(reader.readLine().trim());
            if (called <= (initial + top) / 2) {
                buffer.append("A\n");
                initial = called;
            } else {
                buffer.append("B\n");
                top = called;
            }
        }
        System.out.println(buffer);
    }
}
