package com.hackerearth.codemonk;

import java.io.*;

/**
 * @author rr38746
 * DATE 01-08-2019
 * TIME 14:37
 */
public class Mystery {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out), true);
        try {
            String input;
            while ((input = reader.readLine()) != null) {
                builder.append(count_one(Long.parseLong(input))).append("\n");
            }
        } finally {
            out.println(builder);
            out.close();
        }
    }

    private static int count_one(long num) {
        int count = 0;
        while (num > 0) {
            num = num & (num - 1);
            count++;
        }
        return count;
    }
}
