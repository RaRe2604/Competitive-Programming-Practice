package com.geeksforgeeks.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Rahul
 * Date 19-06-2019
 * Time 18:46
 */
public class EvenSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        boolean flag = false;
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(EvenSubsetsSolver.countSumSubsets(arr, n));

        }
    }
}

class EvenSubsetsSolver {
    static int countSumSubsets(int[] arr, int n) {
        int result = 0;
        for (int mask = (1 << n) - 1; mask > 0; mask--) {
            int sum = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) list.add(arr[i]);
            }

            for (int x : list)
                sum += x;

            if (sum % 2 == 0)
                result++;
        }
        return result;
    }

}
