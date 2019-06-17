package com.geeksforgeeks.practice;

import java.util.Scanner;


public class ConsonantAndVowelCheck {
	
		public static void main (String[] args)
		{
	    	 Scanner sc = new Scanner(System.in);
	    	 int t = sc.nextInt();
	    	 sc.nextLine();
	    	 boolean flag = false;
	    	 while(t-- > 0){
	    	  String s=sc.nextLine();
	    	  ConsonantAndVowelCheckSolver obj=new ConsonantAndVowelCheckSolver();
	    	  obj.checkString(s);
	    	   
	    }
	}
}

class ConsonantAndVowelCheckSolver {
    
    void checkString(String s)
    {
        int v=0;
        int c=0;
        
        char[] allVowels = {'a', 'e', 'i', 'o', 'u'};
        
        //Your code here
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i) == ' '){
        		continue;
        	}
        	boolean isVowel = false;
        	for(char x: allVowels){
        		if(s.charAt(i) == x){
        			isVowel = true;
        			break;
        		}
        	}
        	
        	if(isVowel)v++;else c++;
        	
        }
        
        
        if(v>c)
        System.out.print("Yes");
        else if(c>v)
        System.out.print("No");
        else
       System.out.print("Same");
        
        System.out.println();
    }
}