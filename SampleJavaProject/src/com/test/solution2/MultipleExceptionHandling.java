package com.test.solution2;

import java.util.Random;

/*
 * Create 3 new types of exceptions. Write a class with a method that throws all three exceptions. 
 * In main method, call the method but only use a single catch clause that will catch all three types of exceptions.
 */
public class MultipleExceptionHandling {

	public static void main(String[] args) {

		try{
			String[] exception = {null, "", "argument", "divideby0", "custom"};
			Random ran = new Random();
			
			for(int i=0; i<exception.length; i++) {
				rethrow(exception[ran.nextInt(exception.length)]);
			}
		} catch(IllegalArgumentException | ArithmeticException | CustomException e){
			//below assignment will throw compile time exception since e is final
			//e = new Exception();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static void rethrow(String s) throws ArithmeticException, CustomException {
		try {
			if (s.equals("argument"))
				throw new IllegalArgumentException("Illegal Argument Exception");
			else if (s.equals("divideby0"))
				throw new ArithmeticException("Divide By 0 Exception");
			else
				throw new CustomException("Custom Exception");
		} catch (Exception e) {
			throw e;
		}
	}

	@SuppressWarnings("serial")
	static class CustomException extends Exception {

		public CustomException(String msg) {
			super(msg);
		}
	}

}
