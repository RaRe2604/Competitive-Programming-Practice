package com.hackerearth.codemonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author rr38746
 * DATE 24-07-2019
 * TIME 15:51
 */
public class Cipher {
    private static final int DIGIT_COUNT = 10;
    private static final int ALPHABET_COUNT = 26;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().trim();
        int rotate = Integer.parseInt(reader.readLine().trim());
        StringBuffer buffer = new StringBuffer();

        for (char character : input.toCharArray()) {
            if (Character.isDigit(character)) {
                character = (char) (((character - '0') + rotate) % DIGIT_COUNT + '0');
            } else if (Character.isLowerCase(character)) {
                character = (char) (((character - 'a') + rotate) % ALPHABET_COUNT + 'a');
            } else if (Character.isUpperCase(character)) {
                character = (char) (((character - 'A') + rotate) % ALPHABET_COUNT + 'A');
            }
            buffer.append(character);
        }
        System.out.println(buffer);
    }
}
