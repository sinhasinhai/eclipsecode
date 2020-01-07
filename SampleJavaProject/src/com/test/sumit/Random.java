package com.test.sumit;

import java.util.Scanner;

/*
 * 1. Professional Java Developers comment the program statement, which is the question I provided, before the class name
 * 
 * Utility method to toggle each character of the input text.
 * Ex: I/P: asastTRdcsdSER O/P: ASASTtrDCSDser
 */
// 2. Please define with a proper class name, ex: ScrambleWordCharacters
public class Random 
{
	//3. Main method should have the calling methods and implementation logic should be a utility method.
	//4. The utility method can have different test case values which could be passed from main method rather than ask user for dynamic input.
	//5. The utility method should handle null and blank param values.
	//6. The method should generate all possible sequences and not any one random value.
	//7. Single character is cloning the character. (-ve testing should be performed)
    public static void main(String[] args) 
    {
        String a;
        Scanner src = new Scanner (System.in);
        System.out.println("Enter the Charater");
        a = src.nextLine();
        char first = a.charAt(0);
        System.out.print(first);
        int v= a.length()-1;
        char last = a.charAt(v);

        for (int i=1; i<a.length()-1;i++)
        {
        	int random= (int )(Math.random() * (v-2) + 1);
            char x=a.charAt(random);
            System.out.print(x);
        }            
        System.out.print(last);
        src.close();
    }
}


