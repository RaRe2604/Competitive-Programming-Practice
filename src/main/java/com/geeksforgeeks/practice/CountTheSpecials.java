package com.geeksforgeeks.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountTheSpecials {

	public static void main(String[] args) throws IOException {
		 // Taking input through Scanner class
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int testcase = Integer.parseInt(reader.readLine());
		
		while(testcase-- > 0){
			String[] arr = reader.readLine().split(" ");
		    int sizeof_array = Integer.parseInt(arr[0]);
		    int k = Integer.parseInt(arr[1]);
		    
		    int a[] = new int[sizeof_array];
		    
			String[] as = reader.readLine().split(" ");
			List<Integer> am = Arrays.asList(as).stream().map(ax->Integer.parseInt(ax)).collect(Collectors.toList());
			Integer[] array = am.stream().toArray(Integer[]::new);
/*
			for(Integer x:array){
				System.out.println(x);
			}
	*/	    
		    new Geeks().countSpecials(array, sizeof_array, k);
		}
		
	}
}

class Geeks{
    static void countSpecials(Integer a[], int n, int k){
        int f = (int)Math.floor(n/k);
        // your code here
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int key : a){
        	//System.out.println("Key: "+key);
            map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
        }
        int count = 0;
        Object[] arr = map.keySet().toArray();
        for(Object key: arr){
            if(map.get(key) == f)
                count++;
        }
        System.out.println(count);
    }
}