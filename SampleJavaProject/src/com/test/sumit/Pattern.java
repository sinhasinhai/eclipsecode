package com.test.sumit;

import java.util.Scanner;

/*
 * 1. Professional Java Developers comment the program statement, which is the question I provided, before the class name
 * 
 * Write a utility method that takes 2 params for finding pattern match. The first param is the pattern to be searched from the second text param and return true if found.
 * Solution:
 * (1) Write a core java program, where the main method calls the static utility method isPatternFound(patternText, originalText)
 * (2) Call the isPatternFound() many times with different param combinations
 * <a> pattern: $a text: rg#$afgw$r*12 O/P: true
 * <b> pattern: encyclopedia@123 text: encyclopedia@123 O/P: true
 * <c> pattern: kcu3gt89whern98 text: n9 O/P: false
 */
// 2. Please define with a proper class name, ex: SequenceSearch / FindPattern
public class Pattern {

	//3. Main method should have the calling methods and implementation logic should be a utility method.
	//4. The utility method can have different test case values which could be passed from main method rather than ask user for dynamic input.
	//5. The utility method should handle null and blank param values.
	//6. Null & empty string should be filtered.
	//7. Value entered should be compared as insensitive case
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the String");
		String txt=src.nextLine();
		System.out.println("Enter the pattern u want to find");
		String pat=src.nextLine();
		boolean isPattern=false;
		int a=txt.length();
		int b=pat.length();
		if(a<b)
		{
			
			System.out.println(isPattern);
		}
		else
		{
			for(int i=0;i<=a-b;i++)
			{
				int j;             
	            for (j = 0; j < b; j++) 
	            { 
	                if (txt.charAt(i + j) != pat.charAt(j)) 
	                { 
	                    break; 
	                } 
	            } 
	   
	            if (j == b) 
	            {   
	            	isPattern=true;                
	            }
	           
			}	
			 
		  System.out.println(isPattern);
		}
		src.close();
	}

}
