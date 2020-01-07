package com.test.sumit;

import java.util.Scanner;

/*
 * 1. Professional Java Developers comment the program statement, which is the question I provided, before the class name
 * 
 * Write a static utility method that considers a number parameter and states if it is a Prime number.
 * Ex: I/P: 2 O/P: PRIME
 * I/P: 17 O/P: PRIME
 * I/P: 39 O/P: NOT PRIME
 */
// 2. Please define with a proper class name, ex: PrimeNumberValidation
public class Prime {

	//3. Main method should have the calling methods and implementation logic should be a utility method.
	//4. The utility method can have different test case values which could be passed from main method rather than ask user for dynamic input.
	//5. The utility method should handle null and blank param values.
	//6. Negative values should be filtered
	//7. Characters should not be considered. InputMismatchException needs to be handled.
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter any number");
		int s = src.nextInt();
		int m,temp;
		boolean isPrime=true;
		for(m=2;m<=s/2;m++)
		{
			temp=s%m;
			if(temp==0)
			{
				isPrime=false;
			}
		}
		if(isPrime)
		{
			System.out.println(s+" is prime");
		}
		else
		{
			System.out.println(s+" is not prime");
		}
		src.close();
	}

}
