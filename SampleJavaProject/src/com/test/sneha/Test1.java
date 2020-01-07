package com.test.sneha;

import java.util.Scanner;

/*
 * 1. Professional Java Developers comment the program statement, which is the question I provided, before the class name
 * 
 * Utility method to toggle each character of the input text.
 * Ex: I/P: asastTRdcsdSER O/P: ASASTtrDCSDser
 */
// 2. Please define with a proper class name, ex: CaseConversion
public class Test1 {

	//3. Main method should have the calling methods and implementation logic should be a utility method.
	//4. The utility method can have different test case values which could be passed from main method rather than ask user for dynamic input.
	//5. The utility method should handle null and blank param values.
	public static void main(String[] args) {
		//6. Remove the auto generated comment. If not removed, it states that the code implementation is incomplete.
		// TODO Auto-generated method stub
		
		//7. Since the code is not aligned / formatted, please press ctrl+shift+F to auto correct formatting
     Scanner scn=new Scanner(System.in);
     System.out.println("enter the string");
     String s=scn.nextLine();
     char[]ch=s.toCharArray();
     for(int i=0;i<ch.length;i++)
     {
    	 if(ch[i]>=65 && ch[i]<=90)
    	 {
    		 ch[i]=(char)(ch[i]+32);
    	 }
    	 else if(ch[i]>=97 && ch[i]<=122) {
    		 ch[i]=(char)(ch[i]-32);
    	 }
    	 System.out.print(ch[i]);
     }
     
     
	}

}
