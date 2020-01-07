package com.test.sneha;

import java.util.Scanner;

/*
 * 1. Professional Java Developers comment the program statement, which is the question I provided, before the class name
 * 
 * Write a program to randomize letter order in a word while keeping the first and the last letter in place.
 * EX: I/P: ENGINE O/P: ENNIGE, EIGNNE, EINNGE, EINNGE, ENIGNE, ENGINE, ENGNIE, ENINGE
 */
// 2. Please define with a proper class name, ex: JuggledStringSequence
public class Test4 {

	//3. Main method should have the calling methods and implementation logic should be a utility method.
	//4. The utility method can have different test case values which could be passed from main method rather than ask user for dynamic input.
	//5. The utility method should handle null and blank param values.
	//6. The method should generate all possible sequences and not any one random value.
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String a;
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the value");
        a = scn.nextLine();
        char first = a.charAt(0);
        System.out.print(first);
        int v= a.length()-1;
        char last = a.charAt(v);

        int k= a.length();
        

        for (int i=1; i<a.length()-1;i++){
            int random= (int )(Math.random() * (k-2) + 1);
            char x=a.charAt(random);          
            System.out.print(x);
        }            
        System.out.print(last);

	}

}
