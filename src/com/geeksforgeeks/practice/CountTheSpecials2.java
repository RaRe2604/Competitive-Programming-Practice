package com.geeksforgeeks.practice;

import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.lang.*;

class CountTheSpecials2 {
	public static void main (String[] args) {
	    
	    // Taking input through Scanner class
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    int sizeof_array = sc.nextInt();
		    int k = sc.nextInt();
		    
		    int a[] = new int[sizeof_array];
		    
		    for(int i = 0;i<sizeof_array;i++){
		        a[i] = sc.nextInt();
		    }
		    
		    Solver.countSpecials(a, sizeof_array, k);
		}
		
	}
}

class Solver{
    static void countSpecials(int a[], int n, int k){
        Long f = (long)Math.floor(n/k);
		System.out.println(Arrays.stream(a).boxed().collect(Collectors.groupingBy(m->m, Collectors.counting())).values().stream().filter(val -> val.equals(f)).collect(Collectors.counting()));
		
		/*
		  Map<Integer, Integer> map = new HashMap<>();
        
        for(int key : a){
        	//System.out.println("Key: "+key);
            map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
        }
        int count = 0;
        Object[] arr = map.keySet().toArray();
        for(Object key: arr){
            if(map.get(key) == f){
                count++;
                //System.out.println(key);
            }
        }
        System.out.println(count);
		 */
    }
    
}