package com.geeksforgeeks.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PredictTheColumn {

	public static void main(String[] args) {
		// Taking input using scanner class
		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();

		while (testcase-- > 0) {
			int n = sc.nextInt();
			int a[][] = new int[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println(SolverPredict.columnWithMaxZero(a, n));
		}
	}
}

class SolverPredict {
	static int columnWithMaxZero(int a[][], int n) {

		// Your code here
/*		
		Long data = Arrays.stream(a).flatMapToInt(Arrays::stream).boxed().filter(num->num.equals(0)).collect(Collectors.counting()); //forEach(System.out::println);
		System.out.println(data);
		return 0;
		
		*/
		
		int result = 0;
		int index = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (a[j][i] == 0) {
					count++;
				}
			}
			// System.out.println(i+"->"+count);
			if (result < count) {
				result = count;
				index = i;
			}
		}
		return index;
		
	}
}
