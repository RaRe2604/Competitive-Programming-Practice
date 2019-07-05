package com.hackerearth.codemonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CostOfBaloons {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(reader.readLine());
        while (testcase-- > 0) {

            String[] coloursPrice = reader.readLine().split(" ");
            int costOfGreen = Integer.parseInt(coloursPrice[0]);
            int costOfPurple = Integer.parseInt(coloursPrice[1]);

            int status = Integer.parseInt(reader.readLine().trim());
            int startWithGreen = 0;
            int startWithPurple = 0;
            while (status-- > 0) {
                String[] participants = reader.readLine().split(" ");
                if (Integer.parseInt(participants[0]) == 1) {
                    startWithGreen++;
                }
                if (Integer.parseInt(participants[1]) == 1) {
                    startWithPurple++;
                }
            }

            int purple = (startWithPurple * costOfPurple) + (startWithGreen * costOfGreen);
            int green = (startWithGreen * costOfPurple) + (startWithPurple * costOfGreen);

            System.out.println(purple < green ? purple : green);
        }
    }
}