package com.test.solution;

/*
 * Write a static utility method that considers a number parameter and states if it is a Prime number.
 * Ex: I/P: 2 O/P: PRIME
 * I/P: 17 O/P: PRIME
 * I/P: 39 O/P: NOT PRIME
 */
public class VerifyPrimeNumber {

	public static void main(String[] args) {

		int num = 0;
		System.out.println(num+" is "+(isPrime(num)?"":"NOT ")+"a PRIME NUMBER");
		
		num = -1;
		System.out.println(num+" is "+(isPrime(num)?"":"NOT ")+"a PRIME NUMBER");
		
		num = 2;
		System.out.println(num+" is "+(isPrime(num)?"":"NOT ")+"a PRIME NUMBER");
		
		num = 27;
		System.out.println(num+" is "+(isPrime(num)?"":"NOT ")+"a PRIME NUMBER");
		
		num = 109;
		System.out.println(num+" is "+(isPrime(num)?"":"NOT ")+"a PRIME NUMBER");
		
	}
	
	/*
	 * Utility method to verify if the input number is a prime number
	 */
	
	public static boolean isPrime(int num) {
		
		if(num < 0) {
			System.out.print("INVALID I/P ! ");
			return false;
		}
		
		if(num == 0 || num == 1) {
			return false;
		}
		
		if(num == 2 || num == 3 || num == 5 || num == 7) {
			return true;
		}
		
		if(num % 2 == 0) {
			return false;
		}
		
		for(int i=3; i < (num/2+1); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
