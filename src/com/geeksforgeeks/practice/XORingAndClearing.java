package com.geeksforgeeks.practice;

import java.util.Arrays;
import java.util.Scanner;

public class XORingAndClearing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        boolean flag = false;
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();


            XORingAndClearingSolver obj = new XORingAndClearingSolver();
            XORingAndClearingSolver.xor1ToN(arr, n);
            XORingAndClearingSolver.printArr(arr, n);
            XORingAndClearingSolver.setToZero(arr, n);
            XORingAndClearingSolver.printArr(arr, n);

        }
    }
}

class XORingAndClearingSolver {

    static void printArr(int[] arr, int n) {
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
//        for (int num:arr) System.out.print(num + " ");
        System.out.println();
    }

    static void setToZero(int[] arr, int n) {
        Arrays.fill(arr, 0);
    }

    static void xor1ToN(int[] arr, int n) {
        for (int i = 0; i < n; i++) arr[i] = arr[i] ^ i;
    }
}
