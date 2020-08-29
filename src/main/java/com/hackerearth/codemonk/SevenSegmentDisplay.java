package com.hackerearth.codemonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author rr38746
 * DATE 10-07-2019
 * TIME 12:34
 */
public class SevenSegmentDisplay {
    public static void main(String[] args) throws IOException {
        int[] sevenSegment = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(reader.readLine().trim());

        StringBuffer buffer = new StringBuffer();

        while (testcases-- > 0) {
            String number = reader.readLine().trim();
            int matchSticks = 0;
            for (int i = 0; i < number.length(); i++) {
                matchSticks += sevenSegment[number.charAt(i) - '0'];
            }
            if ((matchSticks & 1) == 1) { //ODD
                for (int i = 1; i <= matchSticks; i++) {
                    if (i == 1) {
                        buffer.append("7");
                        i = i + 2;
                    } else {
                        buffer.append("1");
                        i++;
                    }

                }
            } else { //EVEN
                for (int i = 0; i < matchSticks / 2; i++) {
                    buffer.append("1");
                }
            }
            buffer.append("\n");
        }
        System.out.print(buffer);
    }
}