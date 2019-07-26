package com.hackerearth.codemonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author rr38746
 * DATE 26-07-2019
 * TIME 15:49
 */
public class SahilComputerAddress {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ipAddress = reader.readLine().trim();
        boolean isValid = true;
        String[] parts = ipAddress.split("\\.");
        if (parts.length == 4) {
            for (String value : parts) {
                System.out.println(value);
                if (value.length() < 1 || value.length() > 3 || Integer.parseInt(value) < 0 || Integer.parseInt(value) > 255) {
                    isValid = false;
                    break;
                }
            }
        } else {
            isValid = false;
        }
        System.out.println(isValid ? "YES" : "NO");
    }
}
