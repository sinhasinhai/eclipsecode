package com.practice.java;

public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String name="snehasinha";
   char[] firstname=name.toCharArray();
   for(int i=firstname.length-1;i>=0;i--) {
	   System.out.println(firstname[i]);
   }
	}

}
