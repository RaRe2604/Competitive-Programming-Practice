package com.hackerearth.codemonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

/**
 * @author rr38746
 * DATE 05-07-2019
 * TIME 18:28
 */
public class Duration {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(reader.readLine().trim());
        while (testcases-- > 0) {
            String[] line = reader.readLine().trim().split(" ");
            int SH = Integer.parseInt(line[0]);
            int SM = Integer.parseInt(line[1]);
            int EH = Integer.parseInt(line[2]);
            int EM = Integer.parseInt(line[3]);

            java.time.Duration duration = java.time.Duration.between(LocalTime.of(SH, SM, 0), LocalTime.of(EH, EM, 0));
            System.out.println(duration.toHours() + " " + (duration.toMinutes() - (duration.toHours() * 60)));
        }
    }
}
