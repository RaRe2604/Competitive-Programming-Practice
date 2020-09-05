package com.hackerearth.codemonk;

import java.util.Scanner;

/**
 * User: Rahul Reddy
 * Date: 9/5/2020
 * Time: 3:39 PM
 */

public class MonkAndRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcases = scan.nextInt();
        StringBuilder builder = new StringBuilder();
        while (testcases-- > 0) {
            int length = scan.nextInt();
            int rotate = scan.nextInt();
            int[] array = new int[length];
            for (int i = 0; i < length; i++) {
                array[(i + rotate) % length] = scan.nextInt();
            }
            for (int i = 0; i < length; i++) {
                builder.append(array[i]).append(" ");
            }
            builder.append("\n");
        }
        System.out.print(builder);
    }
}
