package com.hackerearth.codemonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author rr38746
 * DATE 09-07-2019
 * TIME 13:12
 */
public class BookOfPortionMaking {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] isbnNumber = reader.readLine().toCharArray();
        boolean isValid = false;
        int length = isbnNumber.length;
        int sum = 0;
        if (length == 10) {
            for (int i = 1; i <= length; i++) {
                sum = sum + ((isbnNumber[i - 1] - '0') * i);
//                System.out.println(sum);
            }
            isValid = sum % 11 == 0;
        }
        System.out.println(isValid ? "Legal ISBN" : "Illegal ISBN");
    }

}
