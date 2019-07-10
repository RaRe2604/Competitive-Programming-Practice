package com.hackerearth.codemonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author rr38746
 * DATE 09-07-2019
 * TIME 19:13
 */
public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine().trim();
        int number = Integer.parseInt(line);
        int j = 2;
        while (j < number) {
            boolean valid = false;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    valid = true;
                    break;
                }
            }
            System.out.print(valid ? "" : j + " ");
            j++;
        }
    }
}
