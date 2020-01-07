package com.test.sumit;

/*
 * 1. Professional Java Developers comment the program statement, which is the question I provided, before the class name
 * 
 * Write a utility method to find the frequency of times the pattern is found in the text string.
 * Ex: I/P: pattern: bcd text: aserwebcdasdbcdbcderbbcd O/P: Frequency: 4
 */
// 2. Please define with a proper class name, ex: PatternFrequency / PatternOccurance
public class numberOfPattern 
{

	//3. Main method should have the calling methods and implementation logic should be a utility method.
	//4. The utility method can have different test case values which could be passed from main method rather than ask user for dynamic input.
	//5. The utility method should handle null and blank param values.
	//6. Unable to enter other pattern and sequence texts for testing.
	public static void main(String[] args) 
	{
		
		 String pat="bcd";
		 String txt = "aserwebcdasdbcdbcderbbcd";
		 int M = pat.length();         
	     int N = txt.length();         
	     int res = 0; 
	  
	     for (int i = 0; i <= N - M; i++) 
	     { 
	            int j;             
	            for (j = 0; j < M; j++) 
	            { 
	                if (txt.charAt(i + j) != pat.charAt(j)) 
	                { 
	                    break; 
	                } 
	            } 
	   
	            if (j == M) 
	            {   
	            	System.out.println(res);
	                res++;                 
	                j = 0;                 
	            }             
	        }
	     System.out.println(res);
	}

}
