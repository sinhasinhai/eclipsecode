package com.test.sneha2;

public class ExceptionHandle {
	
//main
	public static void main(String[] args) {
//to handle the exception using try and catch	
		try{
			String str= "ArrayIndexOutOfBoundsException";
			rethrow(str);
			MyArrayIndexOutOfBoundsException a=new MyArrayIndexOutOfBoundsException(str);
			String string="MyIOException";
			rethrow(string);
			MyIOException b=new MyIOException(string);
			String st="MyInterruptedException";
			rethrow(st);
			MyInterruptedException c=new MyInterruptedException(st);
		}catch(Exception e){
			//below assignment will throw compile time exception since e is final
			//e = new Exception();
			System.out.println(e.getMessage());
		}
	}
//Re-throw of all three exception in static 
	static void rethrow(String s) throws MyArrayIndexOutOfBoundsException, MyIOException,MyInterruptedException {
		try {
			if (s.equals("ArrayIndexOutOfBoundsException"))
				throw new MyArrayIndexOutOfBoundsException("array index value value going out of boundery");
			
			else if (s.equals("MyIOException"))
				throw new MyIOException("Input and output eception is sending");
			
			else if(s.equals("MyInterruptedException"))
				throw new MyInterruptedException("the thead is waiting");
		  
		} 
		catch (Exception e) 
		 {
			//below assignment disables the improved Re-throw exception type checking feature of Java
			// e=new ThirdException(); which is help in all the exception catch properly
			throw e;
		 }
	}



}

	

