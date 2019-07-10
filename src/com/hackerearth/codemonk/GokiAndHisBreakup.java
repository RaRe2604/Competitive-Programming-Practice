package com.hackerearth.codemonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author rr38746
 * DATE 10-07-2019
 * TIME 11:59
 */
public class GokiAndHisBreakup {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine().trim());
        int limit = Integer.parseInt(reader.readLine().trim());
        StringBuffer buffer = new StringBuffer();
        while (count-- > 0) {
            if (Integer.parseInt(reader.readLine().trim()) >= limit)
                buffer.append("YES");
            else
                buffer.append("NO");
            buffer.append("\n");
        }
        System.out.println(buffer);
    }
}
