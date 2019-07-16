package com.hackerearth.codemonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author rr38746
 * DATE 12-07-2019
 * TIME 17:47
 */
public class AmanMrSharma {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int days = Integer.parseInt(reader.readLine().trim());
        int count = 0;
        while (days-- > 0) {
            String[] line = reader.readLine().split(" ");
            Double radius = Double.valueOf(line[0]);
            Double horlicks = Double.valueOf(line[1]);

            double perimeter = (44 * radius) / 7;
            if (perimeter <= (horlicks * 100)) {
                count++;
            }
        }
        System.out.println(count);
    }
}